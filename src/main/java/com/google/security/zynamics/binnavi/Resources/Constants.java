/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Resources;

/**
 * Contains a bunch of project-wide constants.
 */
public final class Constants {
  /**
   * Build id for the BinNavi built. See {@link BuildVersionInformation} for more information.
   */
  public static final String BUILD_ID = BuildVersionInformation.getBuildId();

  /**
   * Build change list for the BinNavi built. See {@link BuildVersionInformation} for more
   * information.
   */
  public static final String REVISION_NUMBER = BuildVersionInformation.getBuildChangeList();

  /**
   * Name of the company.
   */
  public static final String COMPANY_NAME = "zynamics";

  /**
   * Name of the product.
   */
  public static final String PROJECT_NAME = "BinNavi";

  /**
   * Version number of the product.
   */
  public static final String PROJECT_VERSION = "6.0.0";

  /**
   * Name and version number of the project.
   */
  public static final String PROJECT_NAME_VERSION = PROJECT_NAME + " " + PROJECT_VERSION;

  /**
   * Name, version number, and build number of the project.
   */
  public static final String PROJECT_NAME_VERSION_BUILD =
      PROJECT_NAME_VERSION + " " + REVISION_NUMBER;

  /**
   * Default window title to be used in all windows.
   */
  public static final String DEFAULT_WINDOW_TITLE = COMPANY_NAME + " " + PROJECT_NAME_VERSION;

  /**
   * Root path of the BinNavi installation.
   */
  public static String startPath = "";

  /**
   * The filename of the license file.
   */
  public static final String LICENSE_FILE = "zynamics BinNavi License Key.txt";

  /**
   * The filename of the configuration file.
   */
  public static final String CONFIG_FILE_NAME = "config.xml";

  /**
   * You are not supposed to instantiate this class.
   */
  private Constants() {
    // Do not instantiate me
  }
}
