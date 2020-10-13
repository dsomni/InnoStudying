# Description : Ex2
.data
msg1: .asciiz "Enter the n number : "
new_s: .asciiz "\n"
.text

li $v0 ,4 # t0 = n
la $a0, msg1
syscall
li $v0 ,5
syscall
move $t0 ,$v0

# previous number = t3
# current number = t4

addi $t3, $zero, 0
addi $t4, $zero, 1


loop:
	beq   $t0, $zero, endloop
	
	move $a0, $t4
	li $v0 ,1
	syscall
	
	li $v0 ,4
	la $a0, new_s
	syscall
	
	move $t1, $t4
	add $t2, $t4, $t3
	move $t3, $t1
	move $t4, $t2
	sub $t0, $t0, 1 
	
  	b     loop
endloop:
	li $v0, 10
	syscall
