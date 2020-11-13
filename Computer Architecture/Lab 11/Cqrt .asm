# Description : Cubic Root
	
.data
	l: .double   0.0
	dva: .double 2.0
	e: .double 0.00000000001
	odin: .double 1.0
	cons: .double 1000000000
	cons2: .double 1000
.text


li $v0 ,7
syscall
mov.d $f2, $f0

l.d $f8, cons
mul.d $f2,$f2, $f8

l.d $f14, dva

# x = $f2
# l = $f4
# r = $f6
# m = $f10
# 2 = 14

	
addi $s0, $zero, 100

#l.d $f8, odin
#c.lt.d  $f2, $f8
#bc1t setB
#b setA

l.d $f4, l
mov.d $f6, $f2

b main

main:
	bne $s0, 0, loop
	b End
	
loop:
	addi $s0, $s0, -1
	
	l.d $f10, l
	add.d $f10, $f4, $f6
	div.d $f10, $f10, $f14
	
	mul.d $f16, $f10, $f10
	mul.d $f16, $f16, $f10
	
	c.lt.d  $f16, $f2
	bc1t less
	b more

less:
	mov.d $f4, $f10
	b main
more:
	mov.d $f6, $f10
	b main

	
End:
	#l.d $f8, e
	#add.d $f4, $f4, $f8
	
	l.d $f8, cons2
	div.d $f6,$f6, $f8

	li $v0, 3
	mov.d $f12, $f6
	syscall
	
	li $v0, 10
	syscall
