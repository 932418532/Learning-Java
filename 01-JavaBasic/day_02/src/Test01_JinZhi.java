/**
 * @author Liu Awen
 * @create 2018-05-07 9:37
 */
/*
进制：（了解）
Java
十六进制 0x0f 0X0f  表示十进制15
八进制 017  15
二进制 0b1111 0B1111
1、进制的分类
十进制：
	数字范围：0-9
	进位规则：逢十进一
二进制：
	数字范围：0-1
	进位规则：逢二进一
八进制：
	数字范围：0-7
	进位规则：逢八进一
十六进制：
	数字范围：0-9、A-F（或者a-f）
	进位规则：逢十六进一
8对7说我溢出了 16对15我要进位了 2对1说嗯嗯
2 8 16 10

		十进制	二进制	八进制	十六进制
0		0		0		0		0
1		1		1		1		1
2		2		10		2		2
3		3		11		3		3
4		4		100		4		4
5		5		101		5		5
6		6		110		6		6
7		7		111		7		7
8		8		1000	10		8
9		9		1001	11		9
10		10		1010	12		A
11		11		1011	13		B
12		12		1100	14		C
13		13		1101	15		D
14		14		1110	16		E
15		15		1111	17		F
16		16		10000	20		10
。。。。

25		25		11001

本质上，就是生活中的十进制，和计算机世界中的二进制
因为在计算机中二进制数字太长了，在代码中去表示二进制很繁琐，
那么引入了八进制和十六进制，为了快速和简短的表示二进制
为了快速和简短的表示二进制
（1）十进制-->二进制
（2）二进制-->八进制
把二进制从最右边开始，三位一组
（3）二进制-->十六进制
把二进制从最右边开始，四位一组

2、在程序中如何表示某个数字是十进制、二进制、八进制、十六进制
十进制，正常写
二进制，在数字前面加0B或0b
八进制，在数字前面加0
十六进制，在数字前面加0X或0x

3、为什么byte类型的范围是-128~127？
byte是1个字节，1个字节是8位
计算机中是使用“补码”的形式来存储数据的，为了理解/换算“补码”，我们在引入“原码、反码”。
规定：正数的原码、反码、补码三码合一；
	  负数的原码、反码、补码是不同的。
	  因为计算机中把最高位（最左边的二进制位）定为符号位，0表示正数，1表示负数。
正数的原码、反码、补码三码合一
负数的原码、反码、补码是不同的

25：
	原码：0001 1001
	反码：0001 1001
	补码：0001 1001
-25：
	原码：1001 1001
	反码：1110 0110   符号位不变，其余位取反（0变1,1变0）
	补码：1110 0111   在反码上加1
符号位 0 正数  1 负数
负数  反码   补码 - 1



正0: 0000 0000

正数：
	0000 0001   : 1
		|
	0111 1111	: 127
	2^7-1 = 127
负数：补码
	1000 0001	：  补码（1000 0001）-》反码（1000 0000）--》原码（1111 1111） -127
		|
	1111 1111	：	补码（1111 1111）-》反码（1111 1110）--》原码（1000 0001）-1

负0：1000 0000	如果用它表示负0，就浪费了，所以用它来表示其他的数
	-127的二进制的补码：1000 0001
	1的二进制的补码：0000 0001
    1000 0000  -128
    计算机中用符号位来表示正、负
	-127 - 1 = （补码：1000 0001）-（补码：0000 0001） = 补码（1000 0000） = -128
	计算机中用符号位来表示正、负，就是为了底层设计的简化，让符号位也参与计算。

*/
class Test01_JinZhi{
    public static void main(String[] args){
        System.out.println(10);//十进制，正常写
        System.out.println(0B10);//二进制，在数字前面加0B或0b
        System.out.println(0b10);//二进制，在数字前面加0B或0b
        System.out.println(010);//八进制，在数字前面加0
        System.out.println(0X10);//十六进制，在数字前面加0X或0x
        System.out.println(0x0f);//15
    }
}