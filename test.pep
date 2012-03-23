           .APPEND  "Strings.pep1"
           BR       main
           .BYTE    32                  ;+ "before byte" with capacity
s1:        .ASCII   "TeST_MESsAGE\x00"
as1:       .ADDRSS  s1
main:      NOP0
           LDA      as1,d
           STA      -2,s
           SUBSP    2,i
           CALL     StoLower
           STRO     0,sf
           CHARO    '\n',i 
           CALL     StoUpper
           STRO     0,sf
           CHARO    '\n',i
           ADDSP    2,i
           SUBSP    8,i
           LDA      2,i ;load 2 as n
           STA      6,s
           LDA      0,i ;load 0 as begIndex
           STA      4,s
           LDA      4,i ;load 4 as distance
           STA      2,s
           LDA      as1,d ;load string
           STA      0,s
           CALL     Sshiftl
           STRO     0,sf
           ADDSP    8,i
           STOP