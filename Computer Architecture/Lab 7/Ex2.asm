# Description : Ex2 WordsCounter

.data
	string: .space 100

.text

li $v0 ,8 # t0 = string
la $a0, string
li $a1, 100
move $t0 ,$a0
syscall


li $t2, 0 # answer

lb $t1, 0($t0)
beqz $t1, End
beq $t1, 32, FirstSpace
b FirstLetter

FirstSpace:
	lb $t1, 0($t0)
	beqz $t1, End
	beq $t1,10, End
	addi $t0, $t0, 1
	
	beq $t1, 32, FirstSpace
	
	b FirstLetter
	
FirstLetter:
	b Increment

Loop:
	lb $t1, 0($t0)
	beqz $t1, End
	addi $t0, $t0, 1
	
	beq $t1, 32, WhileSpaces
	b Loop
	
WhileSpaces:
	lb $t1, 0($t0)
	beqz $t1, End
	beq $t1,10, End
	addi $t0, $t0, 1
	beq $t1, 32, WhileSpaces
	b Increment

Increment:
	addi $t2, $t2, 1
	b Loop

End:
	li $v0 ,1
	move $a0 ,$t2
	syscall
	li $v0, 10
	syscall