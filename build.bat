@echo off
java pre-processor\MacroPP %1 > temp.pep
java pre-processor\Resolver temp.pep > tempR.pep
java pre-processor\PrettyPrinter tempR.pep > PEP.pep
dir PEP.pep
