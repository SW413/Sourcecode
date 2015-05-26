/* Simple-OpenCL Hardware setup  */
	sclHard* allHardware;
	sclHard hardware;
	sclSoft software;
	int found = 0;
	allHardware = sclGetAllHardware( &found );
	hardware = sclGetFastestDevice(allHardware, found);

    size_t local_size[2] = {1, 1};
    size_t global_size[2] = {1, 1};

    printf("\n");
/* END Hardware setup */