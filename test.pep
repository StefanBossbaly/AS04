           .APPEND  "Strings.pep1"
		   BR       main
returned:   .WORD    0
            .BYTE    32           ;+ "before byte" with capacity
s1:         .ASCII   "TeST_MESsAGE\x00"
as1:        .ADDRSS  s1
main:    NOP0
         LDA as1,d
         STA -2,s
         SUBSP 2,i
         CALL StoLower
		 STRO 0,sf
         STOP
.END
         
         
