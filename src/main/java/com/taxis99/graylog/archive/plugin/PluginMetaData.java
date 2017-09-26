package com.taxis99.graylog.archive.plugin;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class PluginMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "com.taxis99.graylog-archive-plugin/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "com.taxis99.graylog.archive.plugin.PluginPlugin";
    }

    @Override
    public String getName() {
        return "Plugin";
    }

    @Override
    public String getAuthor() {
        return "99 Taxis <devs@99taxis.com>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/https://github.com/99Taxis/graylog-archive-plugin");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public String getDescription() {
        // TODO Insert correct plugin description
        return "Description of Plugin plugin";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
