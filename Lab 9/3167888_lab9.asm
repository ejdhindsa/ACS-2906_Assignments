;-------------------------------------------------------------------------------------------------------------------------------------------------------
.186 ;You may need to uncomment this to get some of the instructions working (e.g. shl, dest, count)
;-------------------------------------------------------------------------------------------------------------------------------------------------------
data segment ; data segment. Keyword db means define byte. You can also define word (dw)

        stringOne db "Input x: ", 13, 10, '$'
        stringTwo db "Input y:", 13, 10, '$'
        stringThree db "The answer is: ", 13, 10, '$'


data ends

; stack segment
stack1 segment stack
db 100 dup(?) ; This is the stack of 100 bytes
stack1 ends


code segment
assume cs:code, ds:data, ss:stack1

start:
;Perform initialization
mov ax, data ;Put the starting address of the data segment into the ax register (must do this first)
mov ds, ax ;Put the starting address of the data segment into the ds register (where it belongs)

mov ax, stack1 ;Put the starting address of the stack into the ax register (must do this first)
mov ss, ax ;Put the starting address of the stack segment into the ss register (where it belongs)
;-------------------------------------------------------------------------------------------------------------------------------------------------------
;****************** Write Code Here ******************

        ; Name : Ekamjot Singh
        ; Student ID : 3167888

        ; printing the first string
        lea dx, stringOne
        mov ah, 09h
        int 21h

        ; take user input input
        mov ah, 01h
        int 21h

        ; since al now holds userInput adding it to cx
        mov cx, al
        
        ; now since we use cx, we can loop and lower the values so that we may
        ; find the summation of all the values
        summation:

                add al, cx
                loop summation        

        ; line feed
        mov ah, 2
        mov dl, 10
        int 21h

        ; printing the second string


;-------------------------------------------------------------------------------------------------------------------------------------------------------
mov ah, 4ch ;Set up code to specify return to dos
int 21h ;Interpt number 21 (Return control to dos prompt)

;*****************************************************

code ends

end start
;-------------------------------------------------------------------------------------------------------------------------------------------------------