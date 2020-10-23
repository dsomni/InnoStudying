# Description : Ex3 e^2/pi

.data
	e: .double   2.71828
	pi: .double   3.1415

.text

b main

eSquaredDivPi:
	# answer in $f0
	l.d $f0, e
	mul.d $f0, $f0, $f0
	
	l.d $f2, pi
	div.d $f0, $f0, $f2
	
	jr $ra

main:
	jal eSquaredDivPi
	b End
	
	
End:
	li $v0, 3
	mov.d $f12, $f0
	syscall
	
	li $v0, 10
	syscall
