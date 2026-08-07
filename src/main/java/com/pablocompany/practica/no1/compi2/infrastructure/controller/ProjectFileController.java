
package com.pablocompany.practica.no1.compi2.infrastructure.controller;

import com.pablocompany.practica.no1.compi2.domain.context.EditorContext;
import com.pablocompany.practica.no1.compi2.domain.services.FileExportService;
import com.pablocompany.practica.no1.compi2.domain.services.FileOpenService;
import com.pablocompany.practica.no1.compi2.domain.services.FileSaveService;
import java.awt.Component;

/**
 *
 * @author pablo03
 */
public class ProjectFileController {
    
    private final FileOpenService openService;
    private final FileSaveService saveService;
    private final FileExportService exportService;

    public ProjectFileController() {
        this.openService = new FileOpenService();
        this.saveService = new FileSaveService();
        this.exportService = new FileExportService();
    }

    public void handleOpen(Component parent, EditorContext context, Runnable onFileLoaded) {
        if (openService.openFile(parent, context)) {
            if (onFileLoaded != null) {
                onFileLoaded.run();
            }
        }
    }

    public void handleSave(Component parent, EditorContext context) {
        saveService.saveFile(parent, context);
    }

    public void handleExport(Component parent, EditorContext context) {
        exportService.exportCompiledCode(parent, context);
    }
}
