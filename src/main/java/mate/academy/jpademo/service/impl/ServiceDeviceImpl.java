package mate.academy.jpademo.service.impl;

import mate.academy.jpademo.dao.DeviceDao;
import mate.academy.jpademo.model.devices.Device;
import mate.academy.jpademo.service.ServiceDevice;

import java.util.List;

public class ServiceDeviceImpl implements ServiceDevice {
    private final DeviceDao deviceDao;

    public ServiceDeviceImpl(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    public void save(Device device) {
        deviceDao.save(device);
    }

    @Override
    public Device find(Integer id) {
        return deviceDao.findById(id);
    }

    @Override
    public List<Device> getAll() {
        return deviceDao.getAll();
    }

    @Override
    public void delete(Device device) {
        deviceDao.delete(device);
    }

    @Override
    public Device update(Device device) {
        return deviceDao.update(device);
    }
}
