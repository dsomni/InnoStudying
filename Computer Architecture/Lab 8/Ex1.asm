# Description : Ex1 Celsius to Farenheit

.data
	thirtytwo: .double   32.0
	five: .double   5.0
	nine: .double   9.0
	

.text

li $v0 ,7
syscall
mov.d $f2, $f0

b main

main:
	l.d $f0, thirtytwo
	sub.d $f2, $f2, $f0
	
	l.d $f0, five
	mul.d $f2, $f2, $f0
	
	l.d $f0, nine
	div.d $f2, $f2, $f0
	b End
	
	
End:
	li $v0, 3
	mov.d $f12, $f2
	syscall
	
	li $v0, 10
	syscall
