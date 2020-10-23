# Description : Ex2.1 WordsCounter (more clear)

.data
	string: .space 100

.text

li $v0 ,8
la $a0, string
li $a1, 100
syscall

move $s0 ,$a0 # s0 = string
li $s1, 0 # s1 = answer

b main

WhileSpaces:
	lb $t0, 0($s0)
	beqz $t0, End
	beq $t0, 10, End
	
	beq $t0, 32, ReadNextAndGoToWhileSpaces
	jr $ra
	
ReadNextAndGoToWhileSpaces:
	addi $s0, $s0, 1
	b WhileSpaces
	
IncAnswer:
	addi $s1, $s1, 1
	jr $ra
	
WhileLetters:
	lb $t0, 0($s0)
	beqz $t0, End
	beq $t0, 10, End
	
	bne $t0, 32, ReadNextAndGoToWhileLetters
	jr $ra
	
	
ReadNextAndGoToWhileLetters:
	addi $s0, $s0, 1
	b WhileLetters

main:	
	jal WhileSpaces
	jal IncAnswer
	jal WhileLetters
	b main
	
End:
	li $v0, 1
	move $a0, $s1
	syscall
	
	li $v0, 10
	syscall