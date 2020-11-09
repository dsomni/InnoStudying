
module half_adder
(
input x ,
input y ,
output reg s ,
output reg c
);
always @(*)
begin
assign s = x^y;
assign c = x*y;
end
endmodule
