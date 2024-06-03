package io.dropwizard.core.cli;

import net.sourceforge.argparse4j.ArgumentParserBuilder;

public interface ArgumentParserBuilderConfigurer {

    ArgumentParserBuilder configure(ArgumentParserBuilder builder);

    default int getPriority() {
        return 0;
    }
}
