# Description : Ex2 Sum of Natural numbers

.text

b main

ClaculateSum:
	addi $sp, $sp, -8
	sw $ra, 4($sp)
	sw $a0, 0($sp)
	
	seq $t0, $a0, 1
	beq $t0, $zero, rcall
	addi $v0, $zero, 1
	addi $sp, $sp, 8
	jr $ra
	
	rcall:
	addi $a0, $a0, -1
	jal ClaculateSum
	
	lw $a0, 0($sp)
	lw $ra, 4($sp)
	addi $sp, $sp, 8
	add $v0, $a0, $v0
	jr $ra

main:
	li $v0, 5
	syscall
	move $a0, $v0
	
	jal ClaculateSum
	move $s0, $v0
	b End

End:
	li $v0, 1
	move $a0, $s0
	syscall
	
	li $v0, 10
	syscall