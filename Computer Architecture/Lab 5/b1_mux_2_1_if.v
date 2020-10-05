
module b1_mux_2_1_if
(
input x1 ,
input x2 ,
input s,
output reg f
);
always@ (*)
begin
if(s ==1)
f = x2;
else if (s ==0)
f = x1;
end
endmodule
