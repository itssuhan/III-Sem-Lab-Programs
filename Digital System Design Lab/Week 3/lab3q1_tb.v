`timescale 1ns/1ns
`include "lab3q1.v"

module lab3q1_tb;
reg a,b,c,d;
wire f,f2;
lab3q1 uut(a,b,c,d,f,f2);
initial begin

	$dumpfile("lab3q1_tb.vcd");
	$dumpvars(0, lab3q1_tb);
	a=0;b=0;c=0;d=0;
	#20;
	a=0;b=0;c=0;d=1;
	#20;
	a=0;b=0;c=1;d=0;
	#20;
	a=0;b=0;c=1;d=1;
	#20;
	a=0;b=1;c=0;d=0;
	#20;
	a=0;b=1;c=0;d=1;
	#20;
	a=0;b=1;c=1;d=0;
	#20;
	a=0;b=1;c=1;d=1;
	#20;
	a=1;b=0;c=0;d=0;
	#20;
	a=1;b=0;c=0;d=1;
	#20;
	a=1;b=0;c=1;d=0;
	#20;
	a=1;b=0;c=1;d=1;
	#20;
	a=1;b=1;c=0;d=0;
	#20;
	a=1;b=1;c=0;d=1;
	#20;
	a=1;b=1;c=1;d=0;
	#20;
	a=1;b=1;c=1;d=1;
	#20;
	$display("Test Complete");
end
endmodule