public class PDFFactory extends FileCreator {
    @Override
    public FileType createFile() {
        return new PDFFile();
    }
}
