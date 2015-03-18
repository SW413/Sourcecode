package com.doge.checking;
import com.antlr.*;
import com.doge.checking.*;
import com.doge.types.ScopeType;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;
import java.util.List;
import java.util.LinkedList;


/**
 * Created by michno on 18/3/15.
 **/

public class visitorChecker extends ourLangBaseVisitor<Void> {

    public SymbolTable symbolTable;

    public visitorChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Void visitFunctiondeclaration(ourLangParser.FunctiondeclarationContext ctx) {
        //symbolTable.currentScope().define(ctx.ID().getSymbol().);
        symbolTable.pushScope(ScopeType.FUNCTION);

        return super.visitFunctiondeclaration(ctx);
    }
}
