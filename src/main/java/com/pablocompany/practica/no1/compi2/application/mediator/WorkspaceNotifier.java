package com.pablocompany.practica.no1.compi2.application.mediator;

import com.pablocompany.practica.no1.compi2.infrastructure.errors.CompilerError;
import com.pablocompany.practica.no1.compi2.infrastructure.semantic.Symbol;
import java.util.List;

/**
 *
 * @author pablo03
 */
//This interface is the principal port to nofity data to the ui and into the components
public interface WorkspaceNotifier {
    
    /*SECTION OF SIGNALS*/

    void notifyErrorsUpdated(List<CompilerError> compilerErrors);
    void notifySymbolUpdated(List<Symbol> symbols);
    
    
    /*SECTION OF LOGS*/
    void logInfo(String message);

    void logSuccess(String message);

    void logError(String message);

    
    /*SECTION OF ALERTS*/
    
    void alertToast(String message, boolean isError);
    
    /*SECTION OF FOCUS REQUESTS*/

    void focusConsole();

    void focusErrors();
    
    void focusSymbolsTable();
    
    /*SECTION OF CLEAR METHODS OR RESET DATA*/

    void clearLogs();
}
