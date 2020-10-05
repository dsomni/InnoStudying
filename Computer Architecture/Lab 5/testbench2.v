module testbench2 ;
// input and output test signals
reg [1:0] a;
reg [1:0] b;
reg [1:0] c;
reg [1:0] d;
reg [1:0] sel;
wire [1:0]y;
// creating the instance of the module we want to test
mux_4_1_case mux_4_1_case (a, b, c, d, sel , y ) ;
initial
begin
a = 2'b10;
b = 2'b00;
c = 2'b11;
d = 2'b01;
sel = 2'b00;
#5; 
a = 2'b01;
b = 2'b00;
sel = 2'b01;
#10; 
a = 2'b00;
b = 2'b10;
sel = 2'b10;
#10;
a = 2'b00;
b = 2'b01;
sel = 2'b11;
#5;
end
// print signal values on every change
initial
$monitor ("a = %2b b = %2b c = %2b d = %2b sel = %2b y = %2b ", a, b, c, d, sel , y );
initial
$dumpvars ; // dump all variables
endmodule