   import java.util.StringTokenizer;
   public class PCEncrypt
   {
      static char _debug_symbol_cc[] = {'1','4','3','8','6','0','8','4','3'};
      static String _debug_symbol_deckey = new String(_debug_symbol_cc);
      static char _debug_symbol_delim[] = {'x'};
      public static String _debug_symbol_d_debug(String _debug_symbol_string)
      {
         return _debug_symbol_string.substring(7,_debug_symbol_string.length());
      }
      public static String _debug_symbol_d(String _debug_symbol_string)
      {
         String _debug_symbol_sRet = new String();
         StringTokenizer _debug_symbol_tok = new StringTokenizer(_debug_symbol_string,new String(_debug_symbol_delim) );
         int _debug_symbol_nCh = _debug_symbol_tok.countTokens();
         for( int _debug_symbol_i=0;_debug_symbol_i<_debug_symbol_nCh;++_debug_symbol_i)
         {
            int _debug_symbol_keyIdx = _debug_symbol_i%_debug_symbol_deckey.length();
            int _debug_symbol_keyVal = _debug_symbol_deckey.charAt(_debug_symbol_keyIdx);
            String _debug_symbol_sTok = _debug_symbol_tok.nextToken();
            int _debug_symbol_chVal = new Integer(_debug_symbol_sTok).intValue();
            _debug_symbol_chVal=_debug_symbol_chVal-_debug_symbol_keyVal;
            _debug_symbol_sRet+=String.valueOf((char)_debug_symbol_chVal);
         }
         return _debug_symbol_sRet;
      }
   }
