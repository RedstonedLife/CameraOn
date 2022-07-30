package com.bss.inc.cameraon.utils;

public class $EXPL {



}

/*
    $ (D-CLASSES) in this program are Utility only classes, they provide a quick solution for duplicate code that runs 10+ times in 5+ files
    How does the naming of the file work
    Example:
    0 1 2 3 4 5 6
    $ U I $ 0 1 A

    0: Symbolizes it is a D-CLASS
    1 & 2: Symbolize an acronym of what it relates to (i.e UI - User Interface, PS - Post ProceSsing, MH - Math, ect...)
    3: Symbolizes the END of the D-CLASS relation type
    4 & 5: D-CLASS Num Representation 01 - FF (255)
    6: GEN, A-Z, A being first gens if you want to keep them for older variants of the program and for support Z being newest and last.

    Sort of complex I know, Gens?, D-Classes?, Num representations?
    Acronym association?
    Stick with me
    The possibilities for acronyms are endless, cause at the end of the day it doesn't have to be an acronym
    So in total you have 676 possible acronyms between AA-ZZ
    Now the D-CLASS Num is a hex number with anything from 1-255 (FF) and the Gen letter is another 26 possibilities
    so basically for each acronym you have 172,380 possible files and for each file 26 possible generations so in total
    4,481,880 possible files, UPSCALING, am I right?

    Inner D-Class Method naming scheme

    Example:
    0 1 2 3 4 5 6 7
    U _ 0 0 $ 1 $ 1 - UNIQUE
    O _ 0 1 $ 1 $ 2 - OVERLOADED O_00$1$2(int a)
    O _ 0 1 $ 1 $ 2 - OVERLOADED O_00$1$2(int a, int b)

    0 - Symbolizes if the function is UNIQUE and not OVERLOADED, for OVERLOADED functions use O
    1 - Separator
    2 & 3 - Func Num 01 - FF (255)
    4 - Revision Number Separator 1
    5 - Revision Number 1-F (15)
    6 - Func Sub-Num Separator
    7 - Func Sub-Num # 1-F (15)

    Now in the function naming it may be confusing
    Func Num?, Func Sub-Num?, Revision?

    Basically in every possible D-CLASS file you can have 255 Unique Methods and 255 Overloaded methods
    now to allow for upscaling, you can have Multiple revisions, 15 revisions per func num
    and 15 sub-nums per revision so in total for each Func # you can have 225 funcs
    In total 57,375 Functions for OVERLOADED functions and UNIQUE functions
    Huge, right?...

    Constants are not included here, they have separate classes under the constants package.

    REVISED BY TAL ALEXEYVICH "ANATOLI" BASKIN
        ON APRIL 28TH, 2022

 */
