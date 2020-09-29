module ex1(i1,i2,o1);
	input i1,i2;
	output o1;
	
	assign o1 = ~(~i1 & ~i2);
endmodule