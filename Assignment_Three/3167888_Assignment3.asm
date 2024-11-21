;-------------------------------------------------------------------------------------------------------------------------------------------------------
data	segment							; data segment. Keyword db means define byte. You can also define word (dw)
		
        iNum	db  225					;Define input number
        stringOne db 'Enter a 16-bit number: ', '$'      ; end of first string
        stringTwo db 'The decimal unsigned equivalent value is ', '$'   ; end of second stringx

data	ends

										; stack segment
stack1  segment	stack 		
		db	100 dup(?)      			; This is the stack of 100 bytes
stack1  ends


code    segment
        assume  cs:code, ds:data, ss:stack1

start: 
										;Perform initialization 
		mov ax, data					;Put the starting address of the data segment into the ax register (must do this first)
		mov ds, ax						;Put the starting address of the data segment into the ds register (where it belongs)
		
		mov ax, stack1					;Put the starting address of the stack into the ax register (must do this first)
		mov ss, ax						;Put the starting address of the stack segment into the ss register (where it belongs)
;-------------------------------------------------------------------------------------------------------------------------------------------------------		
;****************** Perform your code here ******************

        ; printing the first string
        lea dx, stringOne               ; loading effective address of string
        mov ah, 09h                     ; subroutine 9
        int 21h                         ; Call the OS

        ; now taking the user input
        mov ah, 0Ah                     ; subroutine 10
        int 21h                         ; call the OS

        ; creating a line feed
        mov ah, 02
        mov dl, 10
        int 21h

;-------------------------------------------------------------------------------------------------------------------------------------------------------										
		mov ah, 4ch 					;Set up code to specify return to dos
        int 21h							;Interpt number 21 (Return control to dos prompt)

code    ends

end     start
;-------------------------------------------------------------------------------------------------------------------------------------------------------



