public class SpreadsheetFactory extends FileCreator {
    @Override
    public FileType createFile() {
        return new SpreadsheetFile();
    }
}
