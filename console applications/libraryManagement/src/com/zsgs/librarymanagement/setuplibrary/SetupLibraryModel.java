package com.zsgs.librarymanagement.setuplibrary;

public class SetupLibraryModel {
    
    SetupLibraryController setupLibraryController;

    public SetupLibraryModel(SetupLibraryController setupLibraryController) {
		this.setupLibraryController = setupLibraryController;
	}

    public void setLibraryInfo(String libraryName, String location){
        setupLibraryController.librarySetupSuccess(libraryName,location);
    }

}
