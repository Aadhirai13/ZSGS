package com.zsgs.librarymanagement.setuplibrary;

public class SetupLibraryController {
    
    private SetupLibraryView setupLibraryView;
	private SetupLibraryModel setupLibraryModel;

	public SetupLibraryController(SetupLibraryView setupLibraryView) {
		this.setupLibraryView = setupLibraryView;
		this.setupLibraryModel = new SetupLibraryModel(this);
	}
	
    public void setLibraryInfo(String libraryName, String location){
        setupLibraryModel.setLibraryInfo(libraryName,location);
    }

	public void librarySetupSuccess(String libraryName, String location) {
		setupLibraryView.librarySetupSuccess(libraryName,location);
	}

}
