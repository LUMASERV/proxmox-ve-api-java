package com.lumaserv.proxmox.ve.apis;

import com.lumaserv.proxmox.ve.ProxMoxVEClient;
import com.lumaserv.proxmox.ve.ProxMoxVEException;
import com.lumaserv.proxmox.ve.model.nodes.qemu.QemuVM;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import com.lumaserv.proxmox.ve.request.nodes.qemu.QemuVMCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public class NodeAPI {

    final ProxMoxVEClient client;
    final String nodeName;

    public <T> T request(String method, String path, ProxMoxVERequest<?> request, Class<T> responseType) throws ProxMoxVEException {
        return client.request(method, "/nodes/" + nodeName + path, request, responseType);
    }

    public AbstractElement request(String method, String path, AbstractObject request) throws ProxMoxVEException {
        return client.request(method, "/nodes/" + nodeName + path, request);
    }

    public List<QemuVM> getQemuVMs() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/qemu", null, QemuVM[].class));
    }

    public String createQemuVM(QemuVMCreateRequest request) throws ProxMoxVEException {
        return request("POST", "/qemu", request, String.class);
    }

    public QemuVMAPI qemu(int vmId) {
        return new QemuVMAPI(this, vmId);
    }

}
