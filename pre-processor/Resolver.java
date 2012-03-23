   import java.util.*;
   import java.io.*;
   public class Resolver {
      static final String _debug_symbol_000l =  PCEncrypt._debug_symbol_d_debug( "_debug_\n");
      static final String _debug_symbol_0000 =  PCEncrypt._debug_symbol_d_debug( "_debug_ ");
      static final String l_0000 =  PCEncrypt._debug_symbol_d_debug( "_debug_;");
      static final String l_0101 =  PCEncrypt._debug_symbol_d_debug( "_debug_:");
      static final String _debug_symbol_lllllll_ =  PCEncrypt._debug_symbol_d_debug( "_debug_,");
      static final String _debug_symbol_0l0l =  PCEncrypt._debug_symbol_d_debug( "_debug_.GLOBAL");
      static Integer _debug_symbol_llllllll_ = new Integer(0);
      public static void main (String[] _debug_symbol_args) throws IOException {
         Scanner _00000l = new Scanner(new File(_debug_symbol_args[0]));
         String S = _debug_symbol_looooloool(_00000l);
         S = _l0l0l0l0l0l0l0l0l0l0ll0(S);
         System.out.println(S);
      }
      static String _debug_symbol_looooloool(Scanner _00000l) {
         String looooloool = "";
         while(_00000l.hasNext()) {
            looooloool = looooloool + _00000l.nextLine() + _debug_symbol_000l;
         }
         return looooloool;
      }
      static String _debug_symbol_000_00l(String S, String Comment) {
         int index = S.indexOf(Comment);
         if(index < 0) index = S.length();
         return S.substring(0,index);
      }
      static String _l0l0l0l0l0l0l0l0l0l0ll0(String S) {
         String report = l_0000 +  PCEncrypt._debug_symbol_d_debug( "_debug_Resolver Report:") + _debug_symbol_000l;
         String _debug_symbol_ll =  PCEncrypt._debug_symbol_d_debug( "_debug_LL");
         ArrayList<String> global = new ArrayList<String>();
         ArrayList<String> _debug_symbol_locals = new ArrayList<String>();
         int index;
         int grop, gris;
         index = 0;
         while(index < S.length()) {
            index = S.indexOf(_debug_symbol_0l0l,index);
            if(index < 0) {
               index = S.length();
            }
            else {
               grop = index+_debug_symbol_0l0l.length();
               gris  = S.indexOf(_debug_symbol_000l,grop);
               String label = S.substring(grop,gris).trim();
               label = _debug_symbol_000_00l(label,l_0000);
               if(!global.contains(label)) {
                  global.add(label);
               }
               else {
                  System.out.println(l_0000+ PCEncrypt._debug_symbol_d_debug( "_debug_---WARNING: multiple .GLOBAL for ") + label);
               }
               index = gris + _debug_symbol_000l.length();
            }
         }
         index = 0;
         while(index < S.length()) {
            index = indexOf(S,l_0101,index);
            if(index < 0) {
               index = S.length();
            }
            else {
               grop = S.lastIndexOf(_debug_symbol_000l,index) + _debug_symbol_000l.length();
               String label = S.substring(grop,index).trim();
               if(!_debug_symbol_locals.contains(label)) {
                  _debug_symbol_locals.add(label);
               }
               else {
                  if(global.contains(label)) {
                     System.out.println(l_0000+ PCEncrypt._debug_symbol_d_debug( "_debug_ ERROR ===> duplicate global label, ") + label);
                  }
                  else {
                     int _debug_symbol_cgrop = S.lastIndexOf(_debug_symbol_000l+l_0000+ PCEncrypt._debug_symbol_d_debug( "_debug_{"),grop);
                     int _debug_symbol_cgris  = S.indexOf(_debug_symbol_000l+l_0000+ PCEncrypt._debug_symbol_d_debug( "_debug_}"),index);
                     if((_debug_symbol_cgrop >= 0) && (_debug_symbol_cgris >= 0) && (_debug_symbol_cgrop < _debug_symbol_cgris)) {
                        String O10lO = S.substring(_debug_symbol_cgrop,_debug_symbol_cgris);
                        String _debug_symbol_llnext;
                        do {
                           _debug_symbol_llnext = _debug_symbol_ll + _debug_symbol_llllllll_;
                           _debug_symbol_llllllll_ = new Integer(_debug_symbol_llllllll_.intValue()+1);
                        } while(_debug_symbol_locals.contains(_debug_symbol_llnext));
                        report = report + l_0000 +  PCEncrypt._debug_symbol_d_debug( "_debug_  ") + label +  PCEncrypt._debug_symbol_d_debug( "_debug_ --> ")+_debug_symbol_llnext + _debug_symbol_000l;
                        O10lO = replaceAll(O10lO,_debug_symbol_000l+label+l_0101,_debug_symbol_000l+_debug_symbol_llnext+l_0101);
                        O10lO = replaceAll(O10lO,_debug_symbol_0000+label+_debug_symbol_0000,_debug_symbol_0000+_debug_symbol_llnext+_debug_symbol_0000);
                        O10lO = replaceAll(O10lO,_debug_symbol_0000+label+_debug_symbol_lllllll_,_debug_symbol_0000+_debug_symbol_llnext+_debug_symbol_lllllll_);
                        O10lO = replaceAll(O10lO,_debug_symbol_0000+label+_debug_symbol_000l,_debug_symbol_0000+_debug_symbol_llnext+_debug_symbol_000l);
                        O10lO = replaceAll(O10lO,_debug_symbol_lllllll_+label+_debug_symbol_lllllll_,_debug_symbol_lllllll_+_debug_symbol_llnext+_debug_symbol_lllllll_);
                        O10lO = replaceAll(O10lO,_debug_symbol_lllllll_+label+_debug_symbol_0000,_debug_symbol_lllllll_+_debug_symbol_llnext+_debug_symbol_0000);
                        O10lO = replaceAll(O10lO,_debug_symbol_lllllll_+label+_debug_symbol_000l,_debug_symbol_lllllll_+_debug_symbol_llnext+_debug_symbol_000l);
                        O10lO = replaceAll(O10lO,_debug_symbol_0000+label+l_0000,_debug_symbol_0000+_debug_symbol_llnext+l_0000);
                        O10lO = replaceAll(O10lO,_debug_symbol_lllllll_+label+l_0000,_debug_symbol_lllllll_+_debug_symbol_llnext+l_0000);
                        S = S.substring(0,_debug_symbol_cgrop) + O10lO + S.substring(_debug_symbol_cgris);
                     }
                     else {
                        System.out.println(l_0000+ PCEncrypt._debug_symbol_d_debug( "_debug_ ERROR ===> unable to _l0l0l0l0l0l0l0l0l0l0ll0 dupplicate label, ") + label);
                     }
                  }
               }
               index = index + l_0101.length();
            }
         }
         return S + report;
      }
      static int indexOf(String S, String _debug_symbol_sought, int grop) {
         int looooloool = S.indexOf(_debug_symbol_sought,grop);
         if(looooloool >= 0) {
            int _debug_symbol_earlier0_l = S.lastIndexOf(_debug_symbol_000l,looooloool);
            int _debug_symbol_earlierl_0000 = S.lastIndexOf(l_0000,looooloool);
            if(_debug_symbol_earlier0_l < _debug_symbol_earlierl_0000) {
               looooloool = indexOf(S,_debug_symbol_sought,(looooloool+_debug_symbol_sought.length()));
            }
         }
         return looooloool;
      }
      static String replaceAll(String S, String l010l0l, String l010101) {
         int _debug_symbol_l0l0 = 0;
         int _debug_symbol_prev = _debug_symbol_l0l0;
         while(_debug_symbol_prev < S.length()) {
            _debug_symbol_l0l0 = S.indexOf(l010l0l,_debug_symbol_prev);
            if(_debug_symbol_l0l0 >= 0) {
               S = S.substring(0,_debug_symbol_l0l0) +
                  l010101 +
                  S.substring(_debug_symbol_l0l0+l010l0l.length());
               _debug_symbol_l0l0 = _debug_symbol_l0l0 + l010l0l.length();
            }
            else {
               _debug_symbol_l0l0 = S.length();
            }
            _debug_symbol_prev = _debug_symbol_l0l0;
         }
         return S;
      }
   }
