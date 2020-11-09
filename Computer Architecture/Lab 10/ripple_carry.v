module ripple_carry
(
input [15:0] x , y ,
output [15:0] s ,
output cout
);
wire [15:0] c;
half_adder ha(x[0],y[0],s[0],c[0]);
generate
	genvar i;
	for (i = 1; i <= 15; i = i +1)
	begin : block_name
	full_adder fa(x[i],y[i],c[i-1],s[i],c[i]);
	end
endgenerate 
assign cout = c[15];
endmodule
