   import java.util.*;
   import java.io.File;
   import java.io.IOException;
   import java.util.StringTokenizer;
   import java.util.Iterator;
   public class MacroPP {
      static boolean _debug_symboll00lStackIncluded = true;
      static boolean _debug_symboll00lDefsIncluded = false;
      static boolean _debug_symbol_CommentsIncluded = false;
      final static int _debug_symbol_DEFAULT_WIDTH = 72;
      static int _debug_symbol_Width = _debug_symbol_DEFAULT_WIDTH;
      static String _debug_symboll =  PCEncrypt._debug_symbol_d_debug( "_debug_ ");
      static String _debug_symboll0 =  PCEncrypt._debug_symbol_d_debug( "_debug_\n");
      static String ll =  PCEncrypt._debug_symbol_d_debug( "_debug_;");
      static String ll0 =  PCEncrypt._debug_symbol_d_debug( "_debug_:");
      static String _debug_symbolll0l =  PCEncrypt._debug_symbol_d_debug( "_debug_>");
      static String _debug_symbolll0l0 =  PCEncrypt._debug_symbol_d_debug( "_debug_{");
      static String _debug_symboll0l0l =  PCEncrypt._debug_symbol_d_debug( "_debug_}");
      final static String _debug_symboll01ll0l =  PCEncrypt._debug_symbol_d_debug( "_debug_.INCLUDE");
      final static String _debug_symboll02l00l =  PCEncrypt._debug_symbol_d_debug( "_debug_.APPEND");
      static final String _debug_symboll30l00l =  PCEncrypt._debug_symbol_d_debug( "_debug_.GLOBAL ");
      static String _debug_symbol_deletel0l0100lO1Files;
      final static String END =  PCEncrypt._debug_symbol_d_debug( "_debug_.END");
      static String _debug_symbol_Final = "";
      final static String _debug_symbol_deletel0l0100lO1FilesDELIMITER =  PCEncrypt._debug_symbol_d_debug( "_debug_^");
      final static String _debug_symboll0O0l =  PCEncrypt._debug_symbol_d_debug( "_debug_.MACRO");
      final static String _debug_symbollllll =  PCEncrypt._debug_symbol_d_debug( "_debug_.MACROEND");
      final static String _debug_symboll0lOl0l =  PCEncrypt._debug_symbol_d_debug( "_debug_NOP0");
      final static int _debug_symbolllOllOl0l = 256;
      static int _debug_symbol_n = -1;
      static _debug_symboll00l[] _debug_symboll00ls = new _debug_symboll00l[_debug_symbolllOllOl0l];
      static class _debug_symboll00l implements Iterator {
         static Integer _debug_symboll0Ol0lOl0ll = new Integer(0);
         final String _debug_symboll0 =  PCEncrypt._debug_symbol_d_debug( "_debug_\n");
         final static String _debug_symbol___l0l =  PCEncrypt._debug_symbol_d_debug( "_debug_#");
         String Name;
         String _debug_symbol_A000001101l0;
         String _debug_symbol_0_l_1 = "";
         String _debug_symbol_FA1101l0;
         String _debug_symbol_A00000A1101l0;
         StringTokenizer B;
         StringTokenizer _debug_symbol_A00000L, _debug_symbol_FAL, _debug_symbol_A00000AL;
         public _debug_symboll00l(String name, String _debug_symbol_args) {
            Name = name.trim() +  PCEncrypt._debug_symbol_d_debug( "_debug_ ") ;
            _debug_symbol_A000001101l0 = _debug_symbol_args.trim();
         }
         public void _debug_symbol_A00000ddStatement(String _debug_symbol_statement) {
            if(_debug_symbol_statement.trim().length() > 0) {
               _debug_symbol_0_l_1 = _debug_symbol_0_l_1 + _debug_symbol_statement + _debug_symboll0;
            }
         }
         public String Name() {
            return Name;
         }
         public boolean reset(String _debug_symbol_A00000ctualA1101l0) {
            _debug_symbol_FA1101l0 = _debug_symbol_A000001101l0;
            if(_debug_symbol_FA1101l0.indexOf(_debug_symbol___l0l) >= 0) {
               _debug_symbol_FA1101l0 = _debug_symbol_FA1101l0.replace(_debug_symbol___l0l,_debug_symboll0Ol0lOl0ll.toString());
               _debug_symboll0Ol0lOl0ll = new Integer(_debug_symboll0Ol0lOl0ll.intValue()+1);
            }
            _debug_symbol_A00000A1101l0 = _debug_symbol_A00000ctualA1101l0.trim();
            B = new StringTokenizer(_debug_symbol_0_l_1, PCEncrypt._debug_symbol_d_debug( "_debug_\n"));
            return (B.hasMoreTokens());
         }
         public boolean hasNext() {
            return (B.hasMoreTokens());
         }
         public Object next() {
            String loop0l0l = null;
            if(B.hasMoreTokens()) {
               loop0l0l = B.nextToken();
               _debug_symbol_A00000L  = new StringTokenizer(_debug_symbol_A000001101l0, PCEncrypt._debug_symbol_d_debug( "_debug_,"));
               _debug_symbol_FAL = new StringTokenizer(_debug_symbol_FA1101l0, PCEncrypt._debug_symbol_d_debug( "_debug_,"));
               _debug_symbol_A00000AL = new StringTokenizer(_debug_symbol_A00000A1101l0, PCEncrypt._debug_symbol_d_debug( "_debug_,"));
               while(_debug_symbol_FAL.hasMoreTokens() && _debug_symbol_A00000AL.hasMoreTokens()) {
                  _debug_symbol_A00000L.nextToken();
                  loop0l0l = loop0l0l.replaceFirst(_debug_symbol_FAL.nextToken().trim(),_debug_symbol_A00000AL.nextToken().trim());
               }
               while(_debug_symbol_A00000L.hasMoreTokens() && _debug_symbol_FAL.hasMoreTokens()) {
                  loop0l0l = loop0l0l.replaceFirst(_debug_symbol_A00000L.nextToken().trim(),_debug_symbol_FAL.nextToken().trim());
               }
            }
            return loop0l0l;
         }
         public void remove() {
         }
      }
      static String _debug_symbol_delete01l(int _debug_symbol_n, char _debug_symbol_c) {
         String loop0l0l = "";
         while(_debug_symbol_n > 0) {
            loop0l0l = loop0l0l + _debug_symbol_c;
            _debug_symbol_n = _debug_symbol_n - 1;
         }
         return loop0l0l;
      }
      static boolean _debug_symbol_delete0ll (Scanner _debug_symbol_Input, int width, boolean _debug_symbol_defining, int _debug_symbol_n, String S) throws IOException {
         boolean loop0l0l = false;
         int start, stop;
         if(S.indexOf(_debug_symboll01ll0l) >= 0) {
            start = S.indexOf(_debug_symboll01ll0l) + _debug_symboll01ll0l.length();
            S = S.substring(start);
            start = S.indexOf( PCEncrypt._debug_symbol_d_debug( "_debug_\""));
            if(start >= 0) {
               stop = (S.lastIndexOf( PCEncrypt._debug_symbol_d_debug( "_debug_\"")));
               String _debug_symbol_FID = S.substring((start+1),stop);
               System.out.println(ll + _debug_symbol_delete01l(width,' '));
               System.out.println(ll + _debug_symbolll0l0 + _debug_symboll + _debug_symbol_FID + _debug_symboll +
                  _debug_symbol_delete01l(width-(ll.length()+2+_debug_symbol_FID.length()),'<'));
               loop0l0l = l_l_l_l_l(new Scanner(new File(_debug_symbol_FID)), width);
               System.out.println(ll + _debug_symboll0l0l + _debug_symboll + _debug_symbol_FID + _debug_symboll +
                  _debug_symbol_delete01l(width-(ll.length()+2+_debug_symbol_FID.length()),'>'));
            }
         }
         return loop0l0l;
      }
      static boolean _debug_symbol_deletel0l0100lO1 (Scanner _debug_symbol_Input, int width, boolean _debug_symbol_defining, int _debug_symbol_n, String S) throws IOException {
         boolean loop0l0l = false;
         int start, stop;
         if(S.indexOf(_debug_symboll02l00l) >= 0) {
            start = S.indexOf(_debug_symboll02l00l) + _debug_symboll02l00l.length();
            S = S.substring(start);
            start = S.indexOf( PCEncrypt._debug_symbol_d_debug( "_debug_\""));
            if(start >= 0) {
               stop = (S.lastIndexOf( PCEncrypt._debug_symbol_d_debug( "_debug_\"")));
               String _debug_symbol_FID = S.substring((start+1),stop);
               _debug_symbol_deletel0l0100lO1Files = _debug_symbol_deletel0l0100lO1Files + _debug_symbol_FID + _debug_symbol_deletel0l0100lO1FilesDELIMITER;
               loop0l0l = true;
            }
         }
         return loop0l0l;
      }
      static boolean _debug_symbol_A00000ppendLinkFiles(int width) throws IOException {
         boolean loop0l0l = true;
         String _debug_symbol_FID;
         int _debug_symbol_loc;
         if(_debug_symbol_deletel0l0100lO1Files.length() > _debug_symbol_deletel0l0100lO1FilesDELIMITER.length()) {
            System.out.println( PCEncrypt._debug_symbol_d_debug( "_debug_BR STOPEND"));
            System.out.println(ll + _debug_symbol_delete01l(width,'<'));
            String _debug_symbol_Done = _debug_symbol_deletel0l0100lO1FilesDELIMITER;
            while(_debug_symbol_deletel0l0100lO1Files.length() > _debug_symbol_deletel0l0100lO1FilesDELIMITER.length()) {
               System.out.println(ll + _debug_symbol_delete01l(width,' '));
               _debug_symbol_loc = _debug_symbol_deletel0l0100lO1Files.indexOf(_debug_symbol_deletel0l0100lO1FilesDELIMITER);
               _debug_symbol_FID = _debug_symbol_deletel0l0100lO1Files.substring(0,_debug_symbol_loc);
               _debug_symbol_deletel0l0100lO1Files = _debug_symbol_deletel0l0100lO1Files.substring(_debug_symbol_loc+_debug_symbol_deletel0l0100lO1FilesDELIMITER.length());
               if(_debug_symbol_Done.indexOf(_debug_symbol_deletel0l0100lO1FilesDELIMITER + _debug_symbol_FID + _debug_symbol_deletel0l0100lO1FilesDELIMITER) < 0) {
                  System.out.println(ll + _debug_symbolll0l0 + _debug_symboll + _debug_symbol_FID + _debug_symboll +
                     _debug_symbol_delete01l(width-(ll.length()+2+_debug_symbol_FID.length()),'<'));
                  loop0l0l = loop0l0l && l_l_l_l_l(new Scanner(new File(_debug_symbol_FID)), width);
                  System.out.println(ll + _debug_symboll0l0l + _debug_symboll + _debug_symbol_FID + _debug_symboll +
                     _debug_symbol_delete01l(width-(ll.length()+2+_debug_symbol_FID.length()),'>'));
                  _debug_symbol_Done = _debug_symbol_Done + _debug_symbol_FID + _debug_symbol_deletel0l0100lO1FilesDELIMITER;
               }
            }
            System.out.println(ll + _debug_symbol_delete01l(width,'>'));
         }
         System.out.println( PCEncrypt._debug_symbol_d_debug( "_debug_STOPEND: STOP"));
         System.out.print(_debug_symbol_Final);
         return loop0l0l;
      }
      static String _debug_symbol_EStoString() {
         String result = "";
         if(_debug_symboll00lStackIncluded) {
            for(int _debug_symbol_i=_debug_symbol_ESTop-1; _debug_symbol_i>=0; _debug_symbol_i--) {
               result = result + _debug_symboll00ls[_debug_symbol_ES[_debug_symbol_i]].Name().trim();
               if(_debug_symbol_i > 0) result = result +  PCEncrypt._debug_symbol_d_debug( "_debug_,");
            }
            if(result.length() > 0) {
               result =  PCEncrypt._debug_symbol_d_debug( "_debug_< ")+result+ PCEncrypt._debug_symbol_d_debug( "_debug_ >");
            }
         }
         return result;
      }
      static int[] _debug_symbol_ES = new int[_debug_symbolllOllOl0l];
      static int _debug_symbol_ESTop = 0;
      static boolean _debug_symboll_0_0_l_l(String S, int width, int _debug_symbol_n) throws IOException {
         boolean _debug_symbol_found=false;
         int pos;
         int _debug_symbol_loc;
         String Label = "";
         String _debug_symbol_A00000ctualA1101l0;
         pos = S.indexOf(ll0);
         if(pos >= 0) {
            Label = S.substring(0,pos+1);
            S = S.substring(pos+1);
         }
         S = S.trim();
         for(int _debug_symbol_i=_debug_symbol_n; !_debug_symbol_found && (_debug_symbol_i>=0); _debug_symbol_i--) {
            if(S.length() < _debug_symboll00ls[_debug_symbol_i].Name().length()) {
               S = S +  PCEncrypt._debug_symbol_d_debug( "_debug_ ");
            }
            if(S.startsWith(_debug_symboll00ls[_debug_symbol_i].Name())) {
               _debug_symbol_found = true;
               String _debug_symbol_Head = ll + ll + Label + S +  PCEncrypt._debug_symbol_d_debug( "_debug_ ") + ll;
               if(_debug_symbol_ESTop > 0) _debug_symbol_Head = _debug_symbol_Head + _debug_symbol_EStoString();
               _debug_symbol_ES[_debug_symbol_ESTop] = _debug_symbol_i;  _debug_symbol_ESTop = _debug_symbol_ESTop + 1;
               _debug_symbol_Head = _debug_symbol_Head.replaceFirst( PCEncrypt._debug_symbol_d_debug( "_debug_ "), "") + ' ';
               System.out.println(_debug_symbol_Head);
               S = S + ll;
               int _debug_symboll00lNameLength = _debug_symboll00ls[_debug_symbol_i].Name.length();
               int _debug_symbol_indexOfComment = S.indexOf(ll,_debug_symboll00lNameLength);
               if(_debug_symbol_indexOfComment < 0) _debug_symbol_indexOfComment =  S.length();
               _debug_symbol_A00000ctualA1101l0 = S.substring(_debug_symboll00lNameLength,_debug_symbol_indexOfComment);
               _debug_symboll00ls[_debug_symbol_i].reset(_debug_symbol_A00000ctualA1101l0);
               boolean first = true;
               while(_debug_symboll00ls[_debug_symbol_i].hasNext()) {
                  S = (String)_debug_symboll00ls[_debug_symbol_i].next();
                  if(first) {
                     if(Label.length() > 0) {
                        System.out.println(Label+ PCEncrypt._debug_symbol_d_debug( "_debug_ ")+_debug_symboll0lOl0l+ PCEncrypt._debug_symbol_d_debug( "_debug_ ")+ll+_debug_symbol_EStoString());
                     }
                     first = false;
                  }
                  S = S.trim();
                  if(!_debug_symbol_delete0ll(null, width, false, _debug_symbol_n, S) && !_debug_symboll_0_0_l_l(S,width,_debug_symbol_n)) {
                     String _debug_symbol_Pre, _debug_symbol_Post;
                     _debug_symbol_loc = S.indexOf(ll);
                     if(_debug_symbol_loc >= 0) {
                        _debug_symbol_Pre = S.substring(0,_debug_symbol_loc);
                        _debug_symbol_Post = S.substring(_debug_symbol_loc);
                     }
                     else {
                        _debug_symbol_Pre = S;  _debug_symbol_Post = "";
                     }
                     String _debug_symbol_Tag = _debug_symbol_EStoString();
                     S = _debug_symbol_Pre + ll + _debug_symbol_Tag;
                     if(_debug_symbol_CommentsIncluded) {
                        S = S + _debug_symbol_Post;
                     }
                     if(S.equals(ll+_debug_symbol_Tag)) {
                        S = "";
                     }
                     if(S.length() > 0) {
                        System.out.println(S);
                     }
                  }
               }
               _debug_symbol_ESTop = _debug_symbol_ESTop - 1;
            }
         }
         return _debug_symbol_found;
      }
      static boolean l_l_l_l_l(Scanner _debug_symbol_Input, int width) throws IOException {
         boolean _debug_symbol_defining = false;
         boolean loop0l0l = false;
         loop0l0l = true;
         String S;
         int start, stop;
         while (_debug_symbol_Input.hasNext()) {
            S = _debug_symbol_Input.nextLine().trim();
            if(_debug_symbol_defining) {
               if(S.indexOf(_debug_symbollllll) >= 0) {
                  _debug_symbol_defining = false;
               }
               else if(S.length() > 0) {
                  _debug_symboll00ls[_debug_symbol_n]._debug_symbol_A00000ddStatement(S);
               }
            }
            else if(S.indexOf(END) < 0) {
               if(_debug_symbol_delete0l0l(width,S)) {
               }
               else if(_debug_symbol_delete0ll(_debug_symbol_Input, width, _debug_symbol_defining, _debug_symbol_n, S)) {
               }
               else if(_debug_symbol_deletel0l0100lO1(_debug_symbol_Input, width, _debug_symbol_defining, _debug_symbol_n, S)) {
               }
               else if(S.indexOf(_debug_symboll0O0l) >= 0) {
                  _debug_symbol_defining = true;
                  start = S.indexOf(_debug_symboll0O0l) + _debug_symboll0O0l.length();
                  S = S.substring(start).trim() +  PCEncrypt._debug_symbol_d_debug( "_debug_ ");
                  stop = S.indexOf( PCEncrypt._debug_symbol_d_debug( "_debug_ "));
                  String _debug_symboll00lName = S.substring(0,stop);
                  String _debug_symboll00lArgs = S.substring(stop).trim();
                  if(_debug_symbol_n < _debug_symbolllOllOl0l) {
                     _debug_symbol_n = _debug_symbol_n + 1;
                     _debug_symboll00ls[_debug_symbol_n] = new _debug_symboll00l(_debug_symboll00lName.trim(),_debug_symboll00lArgs.trim());
                  }
                  if(_debug_symboll00lDefsIncluded) {
                     System.out.println(ll + _debug_symboll0O0l+ PCEncrypt._debug_symbol_d_debug( "_debug_ ")+_debug_symboll00lName+ PCEncrypt._debug_symbol_d_debug( "_debug_ ")+_debug_symboll00lArgs);
                  }
               }
               else {
                  if(!_debug_symboll_0_0_l_l(S,width,_debug_symbol_n)) {
                     if(S.length() > 0) {
                        System.out.println(S);
                     }
                  }
               }
            }
            else {
               _debug_symbol_Final = _debug_symbol_Final + S +  PCEncrypt._debug_symbol_d_debug( "_debug_\n");
            }
         }
         return loop0l0l;
      }
      public static boolean _debug_symbol_delete0l0l(int width, String S) {
         boolean result = false;
         int index = S.indexOf(_debug_symboll30l00l);
         if(index >= 0) {
            int _debug_symbol_indexNL = S.lastIndexOf(_debug_symboll0,index);
            int _debug_symbol_indexll = S.lastIndexOf(ll,index);
            if(_debug_symbol_indexNL >= _debug_symbol_indexll) {
               result = true;
               System.out.println(ll + S);
            }
         }
         return result;
      }
      public static void main (String[] _debug_symbol_args) throws IOException {
         Scanner _debug_symbol_Standard = new Scanner(System.in);
         final char _debug_symboll = ' ';
         char _debug_symbol_c;
         if(_debug_symbol_args.length > 0) {
            _debug_symbol_Standard = new Scanner(new File(_debug_symbol_args[0]));
            if(_debug_symbol_args.length > 1) {
               _debug_symboll00lStackIncluded = _debug_symbol_args[1].equalsIgnoreCase( PCEncrypt._debug_symbol_d_debug( "_debug_true"));
               if(_debug_symbol_args.length > 2) {
                  ll = _debug_symbol_args[2];
                  _debug_symboll00lDefsIncluded = ((_debug_symbol_args.length > 3) && (_debug_symbol_args[3].equalsIgnoreCase( PCEncrypt._debug_symbol_d_debug( "_debug_true"))));
                  _debug_symbol_CommentsIncluded = ((_debug_symbol_args.length > 4) && (_debug_symbol_args[4].equalsIgnoreCase( PCEncrypt._debug_symbol_d_debug( "_debug_true"))));
               }
            }
         }
         System.out.println(ll+ PCEncrypt._debug_symbol_d_debug( "_debug_PMJ's MPP ver2012.0 ..."));
         _debug_symbol_deletel0l0100lO1Files = "";
         l_l_l_l_l(_debug_symbol_Standard, _debug_symbol_Width);
         _debug_symbol_A00000ppendLinkFiles(_debug_symbol_Width);
      }
   }
