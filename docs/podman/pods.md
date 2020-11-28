# POD

## ایجاد یک POD

برای ایجاد یک pod 


```bash
podman pod create --name POD_NAME
```

مشاهده لیست podها


‍‍‍```bash
podman pod list
```

مشاهده پراسس های درون podها

```bash
podman ps -a --pod
```

اضافه کردن container به po

```bash
podman run -dt --pod POD_NAME CONTAINER_IMAGE
```

