# Description : Recursive Fibbonachi numbers

.text

b main

Fib:
	addi $sp, $sp, -8
	sw $ra, 4($sp)
	
	slti $t0, $a0, 1
	beq $t0, $zero, rcall
	
	addi $v0, $zero, 1
	
	addi $sp, $sp, 8
	jr $ra
	
	rcall:
	addi $a0, $a0, -1
	jal Fib
	sw $v0, 0($sp)
	addi $a0, $a0, -2
	jal Fib
	
	lw $s0, 0($sp)
	lw $ra, 4($sp)
	addi $sp, $sp, 8
	add $v0, $s0, $v0
	jr $ra

main:
	li $v0, 5
	syscall
	move $a0, $v0
	jal Fib
	move $s0, $v0
	b End

End:
	li $v0, 1
	move $a0, $s0
	syscall
	
	li $v0, 10
	syscall