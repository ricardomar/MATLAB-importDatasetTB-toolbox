# MATLAB importDatasetTB toolbox




## Objectives:

- The HANDLE project has developed a large repository of multi-modal data about the human demonstrations of dexterous manipulation tasks. Request access to HANDLE project database here.

- To promote the utilization of the datasets by the HANDLE partners, improve dissimination of the HANDLE data repository and facilitate the integration of the datasets in the research activities of the HANDLE partners.

- To develop a MATLAB toolbox to automatically import the different types and configurations of datasets that are available (using a storage scheme based on XML) in the HANDLE repository. The MATLAB toolbox should be optimized to deal with datasets with hundreds of megabytes.


## Outputs:

- Development of a MATLAB toolbox - importDatasetTB . The toolbox allows an automatic and fast integration of the HANDLE repository datasets. Initially, the toolbox was compatible with datasets containing data structures of Cyberglobe, Polhemus Liberty, instrumented Rubik cube, Tekscan tactile sensing array, monocular cameras, stereo cameras. Afterwards, it was extended beyond the HANDLE project scope and it was made compatible with more data acquisition devices of the Mobile Robotics Laboratory: Microsoft Kinect, Nintendo Wii mote, NDI optotrak, instrumented sensing soda can, Xsens IMU. The importDatasetTB MATLAB toolbox source code and documentation are available here.

- The toolbox has been developed on top of a Java library (jParserToolbox) that has been developed for this tool. This Java library implements a XML SAX (Simple API for XML) parser for the XML datasets structures. It was possible to use this Java Library on the development of this MATLAB toolbox because MATLAB natively includes a Java Virtual Machine, so that it is possible to use the Java interpreter via MATLAB scripting shell.

- The importDatasetTB MATLAB toolbox imports datasets of hundreds of megabytes in few seconds, improving the low performance and bad memory management of the DOM based XML parsing tools native to MATLAB for large XML data structures.

- The importDatasetTB MATLAB toolbox is currently used by the Mobile Robotics Laboratory team and has been used during the HANDLE project by the HANDLE partners: University of Hamburg, Instituto Superior Tecnico, Orebro University.
