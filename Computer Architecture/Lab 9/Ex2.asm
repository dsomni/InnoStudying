# Description : Ex2 sum 2**i

.text

li $v0 ,5
syscall
move $s0, $v0


li $s1, 1 #counter
li $s2, 2 # 2**i
li $s3, 2 #const
li $s4, 2 #answer

b main

Inc:
	addi $s1, $s1,  1
	mul $s2, $s2, $s3
	add $s4, $s4, $s2
	b main


main:
	bne $s0, $s1, Inc
	b End
	
	
End:
	li $v0, 1
	move $a0, $s4
	syscall
	
	li $v0, 10
	syscall
