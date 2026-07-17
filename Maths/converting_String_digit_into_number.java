public class converting_String_digit_into_number {
    public static void main(String[] args) {
        String a = "12345678";

        for (char ch : a.toCharArray()) {
            System.out.println(ch - '0');
        }
    }
}


// ch-'0'  ---> converts string values into int value..

// How it works ?? 

// '0'  --> 48
// '1' --> 49 
// '2' -->50
// similarly 
// '9' -->57

// so if ch ='5'
// then ch-'0'
// 53-48 = 5



// A	65	uppercase A
// B	66	uppercase B
// C	67	uppercase C
// D	68	uppercase D
// E	69	uppercase E
// F	70	uppercase F
// G	71	uppercase G
// H	72	uppercase H
// I	73	uppercase I
// J	74	uppercase J
// K	75	uppercase K
// L	76	uppercase L
// M	77	uppercase M
// N	78	uppercase N
// O	79	uppercase O
// P	80	uppercase P
// Q	81	uppercase Q
// R	82	uppercase R
// S	83	uppercase S
// T	84	uppercase T
// U	85	uppercase U
// V	86	uppercase V
// W	87	uppercase W
// X	88	uppercase X
// Y	89	uppercase Y
// Z	90	uppercase Z
// [	91	left square bracket
// \	92	backslash
// ]	93	right square bracket
// ^	94	caret
// _	95	underscore
// `	96	grave accent
// a	97	lowercase a
// b	98	lowercase b
// c	99	lowercase c
// d	100	lowercase d
// e	101	lowercase e
// f	102	lowercase f
// g	103	lowercase g
// h	104	lowercase h
// i	105	lowercase i
// j	106	lowercase j
// k	107	lowercase k
// l	108	lowercase l
// m	109	lowercase m
// n	110	lowercase n
// o	111	lowercase o
// p	112	lowercase p
// q	113	lowercase q
// r	114	lowercase r
// s	115	lowercase s
// t	116	lowercase t
// u	117	lowercase u
// v	118	lowercase v
// w	119	lowercase w
// x	120	lowercase x
// y	121	lowercase y
// z	122	lowercase z