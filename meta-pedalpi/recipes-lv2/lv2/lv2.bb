require lv2.inc

DESCRIPTION = "LV2 is a plugin standard for audio systems."

FILES_${PN} += "${datadir}/lv2specgen/* ${datadir}"

BBCLASSEXTEND = "native"

EXTRA_OECONF = " --no-plugins --libdir=${libdir}"
