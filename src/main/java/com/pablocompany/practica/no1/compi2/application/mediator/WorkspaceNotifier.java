package com.pablocompany.practica.no1.compi2.application.mediator;

/**
 *
 * @author pablo03
 */
//This interface is the principal port to nofity data to the ui
public interface WorkspaceNotifier {

    void logInfo(String message);

    void logSuccess(String message);

    void logError(String message);

    void alertToast(String message, boolean isError);

    void focusConsole();

    void focusErrors();

    void clearLogs();
}
