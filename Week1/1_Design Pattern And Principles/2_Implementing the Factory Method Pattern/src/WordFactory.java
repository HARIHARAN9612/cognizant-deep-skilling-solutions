public class WordFactory extends FileCreator {
    @Override
    public FileType createFile() {
        return new WordFile();
    }
}
