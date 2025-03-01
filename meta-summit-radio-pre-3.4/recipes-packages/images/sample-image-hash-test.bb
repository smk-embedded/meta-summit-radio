DESCRIPTION = "Hash Test Image"
LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "${PN}"

IMAGE_FEATURES_remove = "\
	tools-profile \
	tools-debug \
	tools-testapps \
	"

IMAGE_INSTALL += "\
	60-firmware-sdio-sdio \
	60-firmware-sdio-uart \
	60-firmware-pcie-uart \
	60-firmware-pcie-usb \
	60-firmware-usb-uart \
	60-firmware-usb-usb \
	lwb-etsi-firmware \
	lwb-fcc-firmware \
	lwb-jp-firmware \
	lwb5-etsi-firmware \
	lwb5-fcc-firmware \
	lwb5-ic-firmware \
	lwb5-jp-firmware \
	lwb5plus-sdio-div-firmware \
	lwb5plus-sdio-sa-firmware \
	lwb5plus-sdio-sa-m2-firmware \
	lwb5plus-usb-div-firmware \
	lwb5plus-usb-sa-firmware \
	lwb5plus-usb-sa-m2-firmware \
	lwbplus-firmware \
	kernel-module-lwb-backports-summit \
	kernel-module-lwb5p-backports-summit \
	kernel-module-60-backports-summit \
	summit-supplicant-60 \
	summit-supplicant-lwb \
	summit-supplicant-libs-60 \
	summit-supplicant-libs-lwb \
	summit-networkmanager-60 \
	summit-networkmanager-lwb \
	"
