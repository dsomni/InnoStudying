# Description : Ex3 Min(f0,f2,f3,....)

.data
	min: .double   800000000000.0
	message: .asciiz "Enter 8 FP numbers:\n"

.text

l.d $f6, min # answer
li $s0, 0 #counter
li $s1, 8 #const

li  $v0, 4
la $a0, message
syscall

b main

ChangeMin:
	
	mov.d $f6, $f2
	
	b main

Compute:

	addi $s0, $s0, 1

	li $v0 ,7
	syscall
	mov.d $f2, $f0
	
	c.lt.d  $f2, $f6
	bc1t ChangeMin

	b main

main:
	bne $s0, $s1, Compute
	b End
	
	
End:
	li $v0, 3
	mov.d $f12, $f6
	syscall
	
	li $v0, 10
	syscall
