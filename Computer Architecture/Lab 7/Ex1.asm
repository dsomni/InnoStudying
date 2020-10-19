# Description : Ex1 Signum function
.text

li $v0 ,5 # t0 = x
syscall
move $t0 ,$v0

beq $t0, 0, IsZero # x = 0
slti $t0, $t0, 0
beq $t0, 1, LessThanZero # x < 0
b MoreThanZero

IsZero:
	li $t0, 0
	b End

LessThanZero:
	li $t0, -1
	b End

MoreThanZero:
	li $t0, 1
	b End

End:
	li $v0 ,1
	move $a0 ,$t0
	syscall
	li $v0, 10
	syscall
