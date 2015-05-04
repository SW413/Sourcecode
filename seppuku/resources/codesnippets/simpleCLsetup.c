/* Simple-OpenCL Hardware setup  */

	sclHard* allHardware;
	sclHard hardware;
	sclSoft software;
	int found = 0;
	allHardware = sclGetAllHardware( &found );
	hardware = sclGetFastestDevice(allHardware, found);

    size_t local_size[2];
    size_t global_size[2];

/* END Hardware setup */