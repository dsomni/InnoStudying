# Description : Ex1
.data
msg1: .asciiz "Enter the y number : "
msg2: .asciiz "\nEnter the z number : "
msg3: .asciiz "\nEnter the f number : "
msg4: .asciiz "\nEnter the q number : "
result : .asciiz "\nThe result of x = (y*z**2)/f-q is: "
.text

li $v0 ,4 # t0 = y
la $a0, msg1
syscall
li $v0 ,5
syscall
move $t0 ,$v0

li $v0 ,4 # t1 = z
la $a0, msg2
syscall
li $v0 ,5
syscall
move $t1 ,$v0

li $v0 ,4 # t2 = f
la $a0, msg3
syscall
li $v0 ,5
syscall
move $t2 ,$v0

li $v0 ,4 # t3 = q
la $a0, msg4
syscall
li $v0 ,5
syscall
move $t3 ,$v0

mul $t1, $t1, $t1 # t1 = z*z
mul $t5, $t0, $t1 # t5 = y * z*z
div $t6, $t5, $t2 # t6 = (y * z*z)/f
sub $t7, $t6, $t3 # t7 = (y * z*z)/f - q

li $v0 ,4
la $a0, result
syscall
li $v0 ,1
move $a0 ,$t7
syscall
li $v0, 10
syscall
