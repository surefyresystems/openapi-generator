package org.openapitools.codegen.languages;

import org.openapitools.codegen.*;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.MapProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.parameters.Parameter;

import java.io.File;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SurefyreRemoteCallClientCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "projectName";

    static final Logger LOGGER = LoggerFactory.getLogger(SurefyreRemoteCallClientCodegen.class);

    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    public String getName() {
        return "surefyre-remote-call";
    }

    public String getHelp() {
        return "Generates a surefyre-remote-call client.";
    }

    public SurefyreRemoteCallClientCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "surefyre-remote-call";
        // modelTemplateFiles.put("model.mustache", ".zz");
        // apiTemplateFiles.put("api.mustache", ".zz");
        embeddedTemplateDir = templateDir = "surefyre-remote-call";
        apiPackage = "Apis";
        modelPackage = "Models";
        supportingFiles.add(new SupportingFile("generateRemoteCall.mustache", "", "generateRemoteCall.js"));
        // supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        // TODO: Fill this out.
    }
}
