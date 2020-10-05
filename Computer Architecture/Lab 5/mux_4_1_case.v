module mux_4_1_case (
input [1:0] x1 ,
input [1:0] x2 ,
input [1:0] x3 ,
input [1:0] x4 ,
input [1:0] s,
output reg [1:0] f
);
always@ (*)
begin
case (s)
2'b00: f = x1;
2'b01: f = x2;
2'b10: f = x3;
2'b11: f = x4;
endcase
end
endmodule