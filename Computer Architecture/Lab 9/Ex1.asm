# Description : Ex1 Simple Expression

.data
	five: .double   5.4
	twelve: .double   12.3
	eighteen: .double   18.23
	eight: .double   8.23
	

.text

li $v0 ,7
syscall
mov.d $f2, $f0

li $v0 ,7
syscall
mov.d $f4, $f0

# x = $f2
# y = $f4
#answer = $f6

b main

main:
	l.d $f6, five
	mul.d $f6, $f6, $f2
	mul.d $f6, $f6, $f4
	
	l.d $f0, twelve
	mul.d $f0, $f0, $f4
	sub.d $f6, $f6, $f0
	
	l.d $f0, eighteen
	mul.d $f0, $f0, $f2
	add.d $f6, $f6, $f0
	
	l.d $f0, eight
	sub.d $f6, $f6, $f0
	b End
	
	
End:
	li $v0, 3
	mov.d $f12, $f6
	syscall
	
	li $v0, 10
	syscall
