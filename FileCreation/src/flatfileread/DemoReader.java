package flatfileread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoReader {

	private final String filename;
	private final char delimiter;
	private final int expectedDelimitersPerLine;
	private int currentDelimiters; // this is a counter used while looping the file

	DemoReader(String filename, int numColumns) {
		this(filename, numColumns, ' ');
	}

	DemoReader(String filename, int numColumns, char delimiter) {
		this.filename = filename;
		this.delimiter = delimiter;
		this.expectedDelimitersPerLine = numColumns - 1;
	}

	private int countDelimiters(final String line) {
		return (int) line.chars().filter(c -> c == this.delimiter).count();
	}

	List<String> readline() throws IOException {
		final List<String> recordList = new ArrayList<String>();
		final StringBuffer lineBuffer = new StringBuffer();

		try (final Stream<String> lines = Files.lines(Paths.get(this.filename))) {
			lines.forEach(rawline -> {
				final int delimiters = this.countDelimiters(rawline);
				this.currentDelimiters = this.currentDelimiters + delimiters;
				if (delimiters == this.expectedDelimitersPerLine) {
					recordList.add(rawline);
					this.currentDelimiters = 0;
				} else if (this.currentDelimiters >= this.expectedDelimitersPerLine) {
					lineBuffer.append(rawline);
					recordList.add(lineBuffer.toString());
					this.currentDelimiters = 0;
				} else {
					lineBuffer.append(rawline);
				}
			});
		}
		return recordList;
	}

}
