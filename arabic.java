package com.aidcapps.iarabic;

/**
 * Convert Unicode arabic for Intermec/Honeywell/Datamax-Oneil printers
 * <pre>Supported printers : Intermec PB2x,PB3x,PB5x,PRx,PB42.</pre>
 *
 * @author aidcapps
 * @version 1.0
 */

public class arabic {

    static int rows = 44;
    static int columns = 5;
    static char[][] CharArray = new char[rows][columns];

    /**
     * Call this function to convert Arabic in Android for
     * Intermec / Honeywell / Datamax-Oneil printers
     *
     * @param ArabicIn      - Arabic in Unicode String for conversion
     * @param ArabicNumbers - boolean to convert numbers to hindi format or retain latin format. true- convert to hindi numerals false- retain latin numerals
     * @return byte[] after conversion
     * <pre>
     * {@code
     * private arabic arabic_convert = null;
     * arabic_convert = new arabic();
     * byte[] outData = arabic_convert.Convert(unicode arabic here,true);
     * }
     * </pre>
     */
    public byte[] Convert(String ArabicIn, boolean ArabicNumbers) {
        CharArray[37][0] = 'ػ';
        CharArray[37][1] = (char) 0x00e0;
        CharArray[37][2] = (char) 0x00e0;
        CharArray[37][3] = (char) 0x00e0;
        CharArray[37][4] = (char) 0x00e0;
        CharArray[38][0] = (char) 0x0099;
        CharArray[38][1] = (char) 0x0099;
        CharArray[38][2] = (char) 0x009a;
        CharArray[38][3] = (char) 0x0099;
        CharArray[38][4] = (char) 0x0099;
        CharArray[39][0] = (char) 0x009d;
        CharArray[39][1] = (char) 0x009e;
        CharArray[39][2] = (char) 0x009d;
        CharArray[39][3] = (char) 0x009e;
        CharArray[39][4] = (char) 0x009d;
        CharArray[40][0] = (char) 0x0651;
        CharArray[40][1] = (char) 0x00f1;
        CharArray[40][2] = (char) 0x00f1;
        CharArray[40][3] = (char) 0x00f1;
        CharArray[40][4] = (char) 0x00f1;
        CharArray[0][0] = (char) 0x630;
        CharArray[0][1] = (char) 0xd0;
        CharArray[0][2] = (char) 0xd0;
        CharArray[0][3] = (char) 0xd0;
        CharArray[0][4] = (char) 0xd0;
        CharArray[1][0] = (char) 0x62f;
        CharArray[1][1] = (char) 0xcf;
        CharArray[1][2] = (char) 0xcf;
        CharArray[1][3] = (char) 0xcf;
        CharArray[1][4] = (char) 0xcf;
        CharArray[2][0] = (char) 0x62c;
        CharArray[2][1] = (char) 0xad;
        CharArray[2][2] = (char) 0xcc;
        CharArray[2][3] = (char) 0xcc;
        CharArray[2][4] = (char) 0xad;
        CharArray[3][0] = (char) 0x62d;
        CharArray[3][1] = (char) 0xae;
        CharArray[3][2] = (char) 0xcd;
        CharArray[3][3] = (char) 0xcd;
        CharArray[3][4] = (char) 0xae;
        CharArray[4][0] = (char) 0x62e;
        CharArray[4][1] = (char) 0xaf;
        CharArray[4][2] = (char) 0xce;
        CharArray[4][3] = (char) 0xce;
        CharArray[4][4] = (char) 0xaf;
        CharArray[5][0] = (char) 0x647;
        CharArray[5][1] = (char) 0xf3;
        CharArray[5][2] = (char) 0xe7;
        CharArray[5][3] = (char) 0xf4;
        CharArray[5][4] = (char) 0xf3;
        CharArray[6][0] = (char) 0x639;
        CharArray[6][1] = (char) 0xc5;
        CharArray[6][2] = (char) 0xd9;
        CharArray[6][3] = (char) 0xec;
        CharArray[6][4] = (char) 0xdf;
        CharArray[7][0] = (char) 0x63a;
        CharArray[7][1] = (char) 0xed;
        CharArray[7][2] = (char) 0xda;
        CharArray[7][3] = (char) 0xf7;
        CharArray[7][4] = (char) 0xee;
        CharArray[8][0] = (char) 0x641;
        CharArray[8][1] = (char) 0xba;
        CharArray[8][2] = (char) 0xe1;
        CharArray[8][3] = (char) 0xe1;
        CharArray[8][4] = (char) 0xba;
        CharArray[9][0] = (char) 0x642;
        CharArray[9][1] = (char) 0xf8;
        CharArray[9][2] = (char) 0xe2;
        CharArray[9][3] = (char) 0xe2;
        CharArray[9][4] = (char) 0xf8;
        CharArray[10][0] = (char) 0x62b;
        CharArray[10][1] = (char) 0xab;
        CharArray[10][2] = (char) 0xcb;
        CharArray[10][3] = (char) 0xcb;
        CharArray[10][4] = (char) 0xab;
        CharArray[11][0] = (char) 0x635;
        CharArray[11][1] = (char) 0xbe;
        CharArray[11][2] = (char) 0xd5;
        CharArray[11][3] = (char) 0xd5;
        CharArray[11][4] = (char) 0xbe;
        CharArray[12][0] = (char) 0x636;
        CharArray[12][1] = (char) 0xeb;
        CharArray[12][2] = (char) 0xd6;
        CharArray[12][3] = (char) 0xd6;
        CharArray[12][4] = (char) 0xeb;
        CharArray[13][0] = (char) 0x637;
        CharArray[13][1] = (char) 0xd7;
        CharArray[13][2] = (char) 0xd7;
        CharArray[13][3] = (char) 0xd7;
        CharArray[13][4] = (char) 0xd7;
        CharArray[14][0] = (char) 0x643;
        CharArray[14][1] = (char) 0xfc;
        CharArray[14][2] = (char) 0xe3;
        CharArray[14][3] = (char) 0xe3;
        CharArray[14][4] = (char) 0xfc;
        CharArray[15][0] = (char) 0x645;
        CharArray[15][1] = (char) 0xef;
        CharArray[15][2] = (char) 0xe5;
        CharArray[15][3] = (char) 0xe5;
        CharArray[15][4] = (char) 0xef;
        CharArray[16][0] = (char) 0x646;
        CharArray[16][1] = (char) 0xf2;
        CharArray[16][2] = (char) 0xe6;
        CharArray[16][3] = (char) 0xe6;
        CharArray[16][4] = (char) 0xf2;
        CharArray[17][0] = (char) 0x62a;
        CharArray[17][1] = (char) 0xaa;
        CharArray[17][2] = (char) 0xca;
        CharArray[17][3] = (char) 0xaa;
        CharArray[17][4] = (char) 0xaa;
        CharArray[18][0] = (char) 0x627;
        CharArray[18][1] = (char) 0xa8;
        CharArray[18][2] = (char) 0xc7;
        CharArray[18][3] = (char) 0xa8;
        CharArray[18][4] = (char) 0xc7;
        CharArray[19][0] = (char) 0x644;
        CharArray[19][1] = (char) 0xfb;
        CharArray[19][2] = (char) 0xe4;
        CharArray[19][3] = (char) 0xe4;
        CharArray[19][4] = (char) 0xfb;
        CharArray[20][0] = (char) 0x628;
        CharArray[20][1] = (char) 0xa9;
        CharArray[20][2] = (char) 0xc8;
        CharArray[20][3] = (char) 0xc8;
        CharArray[20][4] = (char) 0xa9;
        CharArray[21][0] = (char) 0x64a;
        CharArray[21][1] = (char) 0xf6;
        CharArray[21][2] = (char) 0xea;
        CharArray[21][3] = (char) 0xea;
        CharArray[21][4] = (char) 0xfd;
        CharArray[22][0] = (char) 0x633;
        CharArray[22][1] = (char) 0xbc;
        CharArray[22][2] = (char) 0xd3;
        CharArray[22][3] = (char) 0xd3;
        CharArray[22][4] = (char) 0xbc;
        CharArray[23][0] = (char) 0x634;
        CharArray[23][1] = (char) 0xbd;
        CharArray[23][2] = (char) 0xd4;
        CharArray[23][3] = (char) 0xd4;
        CharArray[23][4] = (char) 0xbd;
        CharArray[24][0] = (char) 0x638;
        CharArray[24][1] = (char) 0xd8;
        CharArray[24][2] = (char) 0xd8;
        CharArray[24][3] = (char) 0xd8;
        CharArray[24][4] = (char) 0xd8;
        CharArray[25][0] = (char) 0x632;
        CharArray[25][1] = (char) 0xd2;
        CharArray[25][2] = (char) 0xd2;
        CharArray[25][3] = (char) 0xd2;
        CharArray[25][4] = (char) 0xd2;
        CharArray[26][0] = (char) 0x648;
        CharArray[26][1] = (char) 0xe8;
        CharArray[26][2] = (char) 0xe8;
        CharArray[26][3] = (char) 0xe8;
        CharArray[26][4] = (char) 0xe8;
        CharArray[27][0] = (char) 0x629;
        CharArray[27][1] = (char) 0xc9;
        CharArray[27][2] = (char) 0xc9;
        CharArray[27][3] = (char) 0xc9;
        CharArray[27][4] = (char) 0xc9;
        CharArray[28][0] = (char) 0x649;
        CharArray[28][1] = (char) 0xf5;
        CharArray[28][2] = (char) 0xe9;
        CharArray[28][3] = (char) 0xf5;
        CharArray[28][4] = (char) 0xe9;
        CharArray[29][0] = (char) 0x631;
        CharArray[29][1] = (char) 0xd1;
        CharArray[29][2] = (char) 0xd1;
        CharArray[29][3] = (char) 0xd1;
        CharArray[29][4] = (char) 0xd1;
        CharArray[30][0] = (char) 0x624;
        CharArray[30][1] = (char) 0xc4;
        CharArray[30][2] = (char) 0xc4;
        CharArray[30][3] = (char) 0xc4;
        CharArray[30][4] = (char) 0xc4;
        CharArray[31][0] = (char) 0x621;
        CharArray[31][1] = (char) 0xc1;
        CharArray[31][2] = (char) 0xc3;
        CharArray[31][3] = (char) 0xa5;
        CharArray[31][4] = (char) 0xc1;
        CharArray[32][0] = (char) 0x626;
        CharArray[32][1] = (char) 0xc6;
        CharArray[32][2] = (char) 0xc6;
        CharArray[32][3] = (char) 0xc6;
        CharArray[32][4] = (char) 0xc6;
        CharArray[33][0] = (char) 0x623;
        CharArray[33][1] = (char) 0xa5;
        CharArray[33][2] = (char) 0xc3;
        CharArray[33][3] = (char) 0xa5;
        CharArray[33][4] = (char) 0xc3;
        CharArray[34][0] = (char) 0x622;
        CharArray[34][1] = (char) 0xa2;
        CharArray[34][2] = (char) 0xc2;
        CharArray[34][3] = (char) 0xa2;
        CharArray[34][4] = (char) 0xc2;
        CharArray[35][0] = (char) 0x625;
        CharArray[35][1] = (char) 0xc7;
        CharArray[35][2] = (char) 0xc7;
        CharArray[35][3] = (char) 0xc7;
        CharArray[35][4] = (char) 0xc7;
        CharArray[36][0] = (char) 0xfefb;
        CharArray[36][1] = (char) 0x9e;
        CharArray[36][2] = (char) 0x9d;
        CharArray[36][3] = (char) 0x9e;
        CharArray[36][4] = (char) 0x9d;
        CharArray[41][0] = (char) 0xf9;
        CharArray[41][1] = (char) 0xf9;
        CharArray[41][2] = (char) 0xfa;
        CharArray[41][3] = (char) 0xf9;
        CharArray[41][4] = (char) 0xf9;
        CharArray[42][0] = (char) 0x64b;
        CharArray[42][1] = (char) 0xf1;
        CharArray[42][2] = (char) 0xf1;
        CharArray[42][3] = (char) 0xf1;
        CharArray[42][4] = (char) 0xf1;
        CharArray[43][0] = (char) 0xfefc;
        CharArray[43][1] = (char) 0x9e;
        CharArray[43][2] = (char) 0x9e;
        CharArray[43][3] = (char) 0x9e;
        CharArray[43][4] = (char) 0x9e;
        String arabicout = ArabicIn.trim();
        boolean shapePrefix, shapeSuffix, foundch;
        foundch = false;
        int i = 0;
        String replacedstr = "";
        for (i = 0; i < ArabicIn.trim().length(); i++) {
            if (ArabicIn.trim().charAt(i) == 'ل') {
                if (i != ArabicIn.trim().length() - 1) {
                    if ((ArabicIn.trim().charAt(i + 1) == 'ا')) {
                        replacedstr = replacedstr + (char) 0x009d;
                        i++;
                    } else if ((ArabicIn.trim().charAt(i + 1) == 'إ')) {
                        replacedstr = replacedstr + (char) 0x0099;
                        i++;
                    } else if ((ArabicIn.trim().charAt(i + 1) == 'آ')) {
                        replacedstr = replacedstr + (char) 0x00f9;
                        i++;
                    } else if ((ArabicIn.trim().charAt(i + 1) == 'أ')) {
                        replacedstr = replacedstr + (char) 0x0099;
                        i++;
                    } else if ((ArabicIn.trim().charAt(i + 1) == 'أ')) {
                        replacedstr = replacedstr + (char) 0x0099;
                        i++;
                    } else {
                        replacedstr = replacedstr + ArabicIn.trim().charAt(i);
                    }
                } else {
                    replacedstr = replacedstr + ArabicIn.trim().charAt(i);
                    //To take care of Lam J at the end of word if it is alone. previous version had left this char
                }
            } else {
                replacedstr = replacedstr + ArabicIn.trim().charAt(i);
            }
        }
        ArabicIn = replacedstr;
        arabicout = replacedstr.trim();
        int rowfound = -1;
        char[] tarray = new char[arabicout.length()];
        for (i = 0; i < ArabicIn.trim().length(); i++) {
            foundch = false;
            rowfound = -1;
            shapePrefix = false;
            shapeSuffix = false;
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    if (CharArray[row][column] == ArabicIn.charAt(i)) {
                        foundch = true;
                        rowfound = row;
                        break;
                    }
                }
                if (foundch)
                    break;
            }
            if (foundch) {
                // end of a word
                if (i == ArabicIn.trim().length() - 1)
                    shapeSuffix = false;
                else
                    shapeSuffix = (CheckShaping1(ArabicIn.trim().charAt(i + 1)) ||
                            CheckShaping2(ArabicIn.trim().charAt(i + 1)));
                // start of a word
                if (i == 0)
                    shapePrefix = false;
                else  // middle of a word
                    shapePrefix = CheckShaping1(ArabicIn.trim().charAt(i - 1));
                if (shapePrefix && shapeSuffix) {
                    arabicout.replace(arabicout.charAt(i), CharArray[rowfound][3]);
                    tarray[i] = CharArray[rowfound][3];
                }
                if (shapePrefix && !shapeSuffix) {
                    arabicout.replace(arabicout.charAt(i), CharArray[rowfound][1]);
                    tarray[i] = CharArray[rowfound][1];
                }
                if (!shapePrefix && shapeSuffix) {
                    arabicout.replace(arabicout.charAt(i), CharArray[rowfound][2]);
                    tarray[i] = CharArray[rowfound][2];
                }
                if (!shapePrefix && !shapeSuffix) {
                    arabicout.replace(arabicout.charAt(i), CharArray[rowfound][4]);
                    tarray[i] = CharArray[rowfound][4];
                }
            } else {
                tarray[i] = arabicout.charAt(i);
            }
        }
        byte[] arafinal = ReverseC(tarray, ArabicNumbers);
        return arafinal;

    }

    private byte[] GetBytes(char[] src) {
        byte[] sourcebyte = new byte[src.length];
        for (int index = 0; index < sourcebyte.length; ++index) {
            sourcebyte[index] = (byte) src[index];
        }
        return sourcebyte;
    }

    boolean CheckShaping1(char indich) {
        char[] GlyphL = new char[]{
                (char) 0x62c, (char) 0x62d, (char) 0x62e, (char) 0x647, (char) 0x639, (char) 0x63a, (char) 0x641, (char) 0x642,
                (char) 0x62b, (char) 0x635, (char) 0x636, (char) 0x637, (char) 0x643, (char) 0x645, (char) 0x646, (char) 0x62a,
                (char) 0x644, (char) 0x628, (char) 0x64a, (char) 0x633, (char) 0x634, (char) 0x638, (char) 0x626, (char) 0x9d, (char) 0x99, (char) 0x9e, (char) 0xfefc, (char) 0xfefb};
        for (int i = 0; i < 26; i++) {
            if (indich == GlyphL[i]) {
                return true;
            }
        }
        return false;
    }

    boolean CheckShaping2(char indich) {
        char[] GlyphL = new char[]{
                (char) 0x627, (char) 0x623, (char) 0x625, (char) 0x622, (char) 0x62f, (char) 0x630,
                (char) 0x631, (char) 0x632, (char) 0x648, (char) 0x624, (char) 0x629, (char) 0x649,
                (char) 0x626, (char) 0xfefb, (char) 0xfef9, (char) 0xfef7, (char) 0xfef5};
        for (int i = 0; i < 17; i++) {
            if (indich == GlyphL[i]) {
                return true;
            }
        }
        return false;
    }

    private char[] Reverse(char[] srcbyte) {
        char[] endbyte = new char[srcbyte.length];
        for (int i = 0; i < srcbyte.length; i++)
            endbyte[i] = srcbyte[srcbyte.length - 1 - i];
        return endbyte;
    }

    boolean IsNumber(char ch) {
        boolean aranum = false;
        char[] GlyphL = new char[]{
                (char) 0x0030, (char) 0x0031, (char) 0x0032, (char) 0x0033, (char) 0x0034, (char) 0x0035,
                (char) 0x0036, (char) 0x0037, (char) 0x0038, (char) 0x0039, (char) 0x0660, (char) 0x0661, (char) 0x0662, (char) 0x0663, (char) 0x0664, (char) 0x0665,
                (char) 0x0666, (char) 0x0667, (char) 0x0668, (char) 0x0669, (char) 0x002e}; // including period(.)
        for (int i = 0; i < 21; i++) {
            if (ch == GlyphL[i]) {
                aranum = true;
                i = 22;
            }
        }
        return aranum;

    }

    boolean CheckChar(char byt) {
        boolean found = false;
        char[] latin = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'
                , 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'
                , 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
                , '~', '!', '@', '#', '$', '%', '^', '&' , '<', '>', ',', '.', '?',' '};
        for (int i = 0; i < latin.length; i++) {
            if (byt == latin[i]) {
                found = true;
                i = latin.length;

            }
        }
        if (!found) {
            char[] hindinumerals = new char[]{'١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩', '٠'};
            for (int i = 0; i < hindinumerals.length; i++) {
                if (byt == hindinumerals[i]) {
                    found = true;
                    i = hindinumerals.length;

                }
            }

        }
        return found;

    }

    private byte[] ReverseC(char[] ArabicIn, boolean ArabicNumbers) {
        // create a clone array and keep a tab on the index
        // to reverse the latin and numbers
        boolean startposset = false;
        char[] ArrayOld = Reverse(ArabicIn);
        char[] ArrayNew = ArrayOld.clone();
        int startpos = 0;
        int charcount = 0;
        for (int i = 0; i < ArrayOld.length; i++) {
            if (CheckChar(ArrayOld[i])) {
                charcount++;
                if (!startposset) {
                    startpos = i;
                    startposset = true;
                }
            } else {
                if (((i - startpos) > 1) && (startposset)) {
                    int pos = 0;
                    int replacepos = i - 1;
                    for (replacepos = i - 1; replacepos >= startpos; replacepos--) {
                        ArrayNew[replacepos] = ArrayOld[startpos + pos];
                        pos++;
                    }
                }
                startposset = false;
            }

        }
        if (charcount == ArrayOld.length) {
            //all are non arabic chars. So reverse them
            startpos = 0;
            int pos = 0;
            for (int replacepos = ArrayOld.length - 1; replacepos >= 0; replacepos--) {
                ArrayNew[replacepos] = ArrayOld[startpos + pos];
                pos++;
            }
        }
        //take care of logical brackets
        // their visual position is as important as their logical position
        for (int i = 0; i < ArrayNew.length; i++) {
            if (ArrayNew[i] == ')')
                ArrayNew[i] = '(';
            else if (ArrayNew[i] == '(')
                ArrayNew[i] = ')';
            if (ArrayNew[i] == '}')
                ArrayNew[i] = '{';
            else if (ArrayNew[i] == '{')
                ArrayNew[i] = '}';
            if (ArrayNew[i] == ']')
                ArrayNew[i] = '[';
            else if (ArrayNew[i] == '[')
                ArrayNew[i] = ']';

        }
        char[] numberreplace = ReplaceNumbers(ArrayNew, ArabicNumbers);
        return GetBytes(numberreplace);

    }

    char[] ReplaceNumbers(char[] in, boolean AraNum) {
        for (int i = 0; i < in.length; i++) {
            if (IsNumber(in[i])) {
                if ((in[i]) == '0' || (in[i]) == '٠') {
                    if (AraNum) {
                        in[i] = 0x00b0;
                    } else
                        in[i] = 0x0030;
                } else if (in[i] == '1' || in[i] == '١') {
                    if (AraNum) {
                        in[i] = 0x00b1;
                    } else
                        in[i] = 0x0031;
                } else if (in[i] == '2' || in[i] == '٢') {
                    if (AraNum) {
                        in[i] = 0x00b2;
                    } else {
                        in[i] = 0x0032;
                    }
                } else if (in[i] == '3' || in[i] == '٣') {
                    if (AraNum) {
                        in[i] = 0x00b3;
                    } else {
                        in[i] = 0x0033;
                    }
                } else if (in[i] == '4' || in[i] == '٤') {
                    if (AraNum) {
                        in[i] = 0x00b4;
                    } else {
                        in[i] = 0x0034;
                    }
                } else if (in[i] == '5' || in[i] == '٥') {
                    if (AraNum) {
                        in[i] = 0x00b5;
                    } else {
                        in[i] = 0x0035;
                    }
                } else if (in[i] == '6' || in[i] == '٦') {
                    if (AraNum) {
                        in[i] = 0x00b6;
                    } else {
                        in[i] = 0x0036;
                    }
                } else if (in[i] == '7' || in[i] == '٧') {
                    if (AraNum) {
                        in[i] = 0x00b7;
                    } else {
                        in[i] = 0x0037;
                    }
                } else if (in[i] == '8' || in[i] == '٨') {
                    if (AraNum) {
                        in[i] = 0x00b8;
                    } else {
                        in[i] = 0x0038;
                    }
                } else if (in[i] == '9' || in[i] == '٩') {
                    if (AraNum) {
                        in[i] = 0x00b9;
                    } else {
                        in[i] = 0x0039;
                    }
                }

            }

        }
        return in;
    }

}
