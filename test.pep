           .APPEND  "Strings.pep1"
           BR       main
           .BYTE    32                  ;+ "before byte" with capacity
s1:        .ASCII   "Hello\x00"
as1:       .ADDRSS  s1
           .BYTE    32                  ;+ "before byte" with capacity
s2:        .ASCII   "ell\x00"
as2:       .ADDRSS  s2
return:    .WORD    0
main:      NOP0
;-- StoLower -----------------------------------------------------------
           LDA      as1,d
           STA      -2,s
           SUBSP    2,i
           CALL     StoLower
           STRO     0,sf
           CHARO    '\n',i 
           ADDSP    2,i
;-- StoUpper -----------------------------------------------------------
           LDA      as1,d
           STA      -2,s
           SUBSP    2,i
           CALL     StoUpper
           STRO     0,sf
           CHARO    '\n',i
           ADDSP    2,i
;-- Sshiftl -----------------------------------------------------------
           SUBSP    8,i
           LDA      2,i ;load 2 as n
           STA      6,s
           LDA      0,i ;load 0 as begIndex
           STA      4,s
           LDA      4,i ;load 4 as distance
           STA      2,s
           LDA      as1,d ;load string
           STA      0,s
           CALL     Sshiftl ;call Sshiftl
           STRO     0,sf    ;ouput Sshiftl
           ADDSP    8,i     ;dealloc memory
;-- SindxOf -----------------------------------------------------------
           SUBSP    10,i     ;alloc memory
           LDA      1,i     ;load 1 as change
           STA      8,s
           LDA      5,i     ;load 5 as end
           STA      6,s
           LDA      0,i     ;load 0 as begin
           STA      4,s
           LDA      as2,d   ;load as2 as Tobject
           STA      2,s
           LDA      as1,d   ;load as1 as Sobject
           STA      0,s
           CALL     SindxOf
           ADDSP    10,i
           STA return,d
           DECO return,d
;-- SnindxOf -----------------------------------------------------------
           SUBSP    6,i     ;alloc memory
           LDA      0,i     ;load 0 as beginIndex
           STA      4,s
           LDA      as2,d   ;load as2 as Tobject
           STA      2,s
           LDA      as2,d   ;load as1 as Sobject
           STA      0,s
           CALL SnindxOf    ;Call sub routine
           ADDSP    6,i     ;dealloc memory
           STA return,d
           DECO return,d    ;output result
           STOP
           .END